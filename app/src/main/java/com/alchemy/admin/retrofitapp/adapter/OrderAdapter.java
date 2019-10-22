package com.alchemy.admin.retrofitapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alchemy.admin.retrofitapp.R;
import com.alchemy.admin.retrofitapp.centmodel.Data;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.EmployeeViewHolder> {

    private ArrayList<Data> dataList;
    private Context context;
    private boolean isLoadingAdded = false;
    private boolean retryPageLoad = false;

    public OrderAdapter(Context context, ArrayList<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.swipe_delete, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Data data = dataList.get(position);
        holder.txtEmpName.setText(data.getOrders().get(0).getChainName());
        holder.txtEmpEmail.setText(data.getOrders().get(0).getOrderStatusText());
        holder.txtEmpPhone.setText(data.getOrders().get(0).getDeliveryStatusText());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void removeItem(int position) {
        dataList.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position);
    }

    public void restoreItem(Data item, int position) {
        dataList.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }

    public void add(Data r) {
        dataList.add(r);
        notifyItemInserted(dataList.size() - 1);
    }

    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(new Data());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = dataList.size() - 1;
        Data data = dataList.get(position);

        if (data != null) {
            dataList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void remove(Data r) {
        int position = dataList.indexOf(r);
        if (position > -1) {
            dataList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(dataList.get(0));
        }
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout viewBackground, viewForeground;
        TextView txtEmpName, txtEmpEmail, txtEmpPhone;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            txtEmpName = itemView.findViewById(R.id.txt_employee_name);
            txtEmpEmail = itemView.findViewById(R.id.txt_employee_email);
            txtEmpPhone = itemView.findViewById(R.id.txt_employee_phone);
            viewBackground = itemView.findViewById(R.id.view_background);
            viewForeground = itemView.findViewById(R.id.view_foreground);
        }
    }

}