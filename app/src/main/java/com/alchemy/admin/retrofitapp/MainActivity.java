package com.alchemy.admin.retrofitapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;

import com.alchemy.admin.retrofitapp.adapter.OrderAdapter;
import com.alchemy.admin.retrofitapp.adapter.RecyclerItemTouchHelper;
import com.alchemy.admin.retrofitapp.centmodel.Data;
import com.alchemy.admin.retrofitapp.centmodel.RespOrders;
import com.alchemy.admin.retrofitapp.helper.ApiClient;
import com.alchemy.admin.retrofitapp.interfaces.RequestInterface;
import com.alchemy.admin.retrofitapp.utils.PaginationScrollListener;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {
    private static final String TAG = "MainActivity";
    private static final int PAGE_START = 1;
    // limiting to 5 for this tutorial, since total pages in actual API is very large. Feel free to modify.
    private static final int TOTAL_PAGES = 5;
    String accessToken;
    ArrayList<Data> arrayList;
    LinearLayoutManager linearLayoutManager;
    RequestInterface requestInterface;
    private OrderAdapter adapter;
    private RecyclerView recyclerView;
    private int page = 1;
    private CoordinatorLayout coordinatorLayout;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int currentPage = PAGE_START;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = findViewById(R.id.coordinator_layout);
        accessToken = MyPreference.getPreferenceManager().getString(Constants.KEY_ACCESS_TOKEN);
        arrayList = new ArrayList<>();

//        RequestInterface service = ApiClient.getClient().create(RequestInterface.class);
//        Call<RespOrders> call = service.getOrderData("Bearer " + accessToken, 53, 0, 5, Integer.parseInt(String.valueOf(page)), 10, 4);
//
//        Log.wtf("URL Called", call.request().url() + "");
//        call.enqueue(new Callback<RespOrders>() {
//            @Override
//            public void onResponse(Call<RespOrders> call, Response<RespOrders> response) {
//                Log.w(TAG, "onResponse: " + response.code());
//                recyclerView = (RecyclerView) findViewById(R.id.recycler_view_employee_list);
//                adapter = new OrderAdapter(MainActivity.this, arrayList);
//                assert response.body() != null;
//                arrayList.addAll(response.body().getData());
//                linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
//                recyclerView.setItemAnimator(new DefaultItemAnimator());
//                recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));
//                recyclerView.setLayoutManager(linearLayoutManager);
//                recyclerView.setAdapter(adapter);
//                ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, MainActivity.this);
//                new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
//            }
//
//            @Override
//            public void onFailure(Call<RespOrders> call, Throwable t) {
//                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
//
//            }
//        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_employee_list);
        adapter = new OrderAdapter(MainActivity.this, arrayList);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, MainActivity.this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);


        recyclerView.addOnScrollListener(new PaginationScrollListener(linearLayoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;

                loadNextPage();
            }

            @Override
            public int getTotalPageCount() {
                return TOTAL_PAGES;
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });
        requestInterface = ApiClient.getClient().create(RequestInterface.class);
        loadFirstPage();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if (viewHolder instanceof OrderAdapter.EmployeeViewHolder) {
            // get the removed item name to display it in snack bar
            String name = arrayList.get(viewHolder.getAdapterPosition()).getOrders().get(0).getOrderPubId();

            // backup of removed item for undo purpose
            final Data deletedItem = arrayList.get(viewHolder.getAdapterPosition());
            final int deletedIndex = viewHolder.getAdapterPosition();

            // remove the item from recycler view
            adapter.removeItem(viewHolder.getAdapterPosition());

            // showing snack bar with Undo option
            Snackbar snackbar = Snackbar
                    .make(coordinatorLayout, name + " removed from cart!", Snackbar.LENGTH_LONG);
            snackbar.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // undo is selected, restore the deleted item
                    adapter.restoreItem(deletedItem, deletedIndex);
                }
            });
            snackbar.setActionTextColor(Color.YELLOW);
            snackbar.show();
        }
    }

    private Call<RespOrders> callTopOrdersApi() {
        return requestInterface.getOrderData(
                "Bearer " + accessToken, 53, 0, 5, Integer.parseInt(String.valueOf(page)), 10, 4
        );
    }

    private void loadFirstPage() {
        Log.d(TAG, "loadFirstPage: ");

        // To ensure list is visible when retry button in error view is clicked
        currentPage = PAGE_START;

        callTopOrdersApi().enqueue(new Callback<RespOrders>() {
            @Override
            public void onResponse(Call<RespOrders> call, Response<RespOrders> response) {
                assert response.body() != null;
                arrayList.addAll(response.body().getData());
                if (currentPage <= TOTAL_PAGES) adapter.addLoadingFooter();
                else isLastPage = true;
            }

            @Override
            public void onFailure(Call<RespOrders> call, Throwable t) {

            }
        });
    }

    private void loadNextPage() {
        Log.d(TAG, "loadNextPage: " + currentPage);

        callTopOrdersApi().enqueue(new Callback<RespOrders>() {
            @Override
            public void onResponse(Call<RespOrders> call, Response<RespOrders> response) {


                adapter.removeLoadingFooter();
                isLoading = false;


                assert response.body() != null;
                arrayList.addAll(response.body().getData());

                if (currentPage != TOTAL_PAGES) adapter.addLoadingFooter();
                else isLastPage = true;
            }

            @Override
            public void onFailure(Call<RespOrders> call, Throwable t) {

            }
        });
    }


    //    public void addFragment(int id, Fragment fragment, boolean addToBackStack, String tag, boolean isAnimate, boolean isArguments, Bundle bundle, boolean isAdd) {
//
//
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction ft = manager.beginTransaction();
//
//        if (isAnimate) {
////            ft.setCustomAnimations(R.anim.slide_in_right,
////                    R.anim.slide_out_left, R.anim.slide_in_left,
////                    R.anim.slide_out_right);
//        }
//
//        if (addToBackStack) {
//            ft.addToBackStack(tag);
//        }
//
//        if (isArguments) {
//            fragment.setArguments(bundle);
//        }
//
//        if (!isAdd) {
//            ft.replace(id, fragment, tag);
//            ft.commitAllowingStateLoss();
//        } else {
//            ft.add(id, fragment, tag);
//            ft.commit();
//        }
//
//    }


}