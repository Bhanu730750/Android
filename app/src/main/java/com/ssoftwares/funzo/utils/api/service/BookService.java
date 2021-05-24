package com.ssoftwares.funzo.utils.api.service;

import com.ssoftwares.funzo.json.CheckStatusTransRequest;
import com.ssoftwares.funzo.json.CheckStatusTransResponse;
import com.ssoftwares.funzo.json.DetailRequestJson;
import com.ssoftwares.funzo.json.DetailTransResponseJson;
import com.ssoftwares.funzo.json.GetNearRideCarRequestJson;
import com.ssoftwares.funzo.json.GetNearRideCarResponseJson;
import com.ssoftwares.funzo.json.ItemRequestJson;
import com.ssoftwares.funzo.json.LocationDriverRequest;
import com.ssoftwares.funzo.json.LocationDriverResponse;
import com.ssoftwares.funzo.json.RideCarRequestJson;
import com.ssoftwares.funzo.json.RideCarResponseJson;
import com.ssoftwares.funzo.json.SendRequestJson;
import com.ssoftwares.funzo.json.SendResponseJson;
import com.ssoftwares.funzo.json.fcm.CancelBookRequestJson;
import com.ssoftwares.funzo.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("customerapi/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("customerapi/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("customerapi/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("customerapi/check_status_transaksi")
    Call<CheckStatusTransResponse> checkStatusTransaksi(@Body CheckStatusTransRequest param);

    @POST("customerapi/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("customerapi/liat_lokasi_driver")
    Call<LocationDriverResponse> liatLokasiDriver(@Body LocationDriverRequest param);

    @POST("customerapi/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
