package com.alchemy.admin.retrofitapp.interfaces;

import com.alchemy.admin.retrofitapp.centmodel.RespOrders;
import com.alchemy.admin.retrofitapp.model.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RequestInterface {

    //    @POST("learn2crack-login-register/")
//    Call<ServerResponse> operation(@Body ServerRequest request);
    @FormUrlEncoded
    @POST("signin")
    Call<Login> getLogin(@Field("client_id") String clientId, @Field("client_secret") String clientSecret, @Field("username") String userName, @Field("password") String password, @Field("provider") String provider, @Field("platform") String platform);

    @GET("orders")
    Call<RespOrders> getOrderData(@Header("Authorization") String header, @Query("store_id") int storeID, @Query("order_status") int orderStatus, @Query("tz") int tz, @Query("page") int page, @Query("per_page") int perPage, @Query("sort") int sort);
}