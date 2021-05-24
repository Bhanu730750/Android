package com.ssoftwares.funzo.utils.api.service;

import com.ssoftwares.funzo.json.AllMerchantByNearResponseJson;
import com.ssoftwares.funzo.json.AllMerchantbyCatRequestJson;
import com.ssoftwares.funzo.json.AllTransResponseJson;
import com.ssoftwares.funzo.json.BankResponseJson;
import com.ssoftwares.funzo.json.NewsDetailRequestJson;
import com.ssoftwares.funzo.json.NewsDetailResponseJson;
import com.ssoftwares.funzo.json.ChangePassRequestJson;
import com.ssoftwares.funzo.json.DetailRequestJson;
import com.ssoftwares.funzo.json.EditprofileRequestJson;
import com.ssoftwares.funzo.json.GetAllMerchantbyCatRequestJson;
import com.ssoftwares.funzo.json.GetServiceResponseJson;
import com.ssoftwares.funzo.json.GetHomeRequestJson;
import com.ssoftwares.funzo.json.GetHomeResponseJson;
import com.ssoftwares.funzo.json.GetMerchantbyCatRequestJson;
import com.ssoftwares.funzo.json.LoginRequestJson;
import com.ssoftwares.funzo.json.LoginResponseJson;
import com.ssoftwares.funzo.json.MerchantByCatResponseJson;
import com.ssoftwares.funzo.json.MerchantByIdResponseJson;
import com.ssoftwares.funzo.json.MerchantByNearResponseJson;
import com.ssoftwares.funzo.json.MerchantbyIdRequestJson;
import com.ssoftwares.funzo.json.PrivacyRequestJson;
import com.ssoftwares.funzo.json.PrivacyResponseJson;
import com.ssoftwares.funzo.json.PromoRequestJson;
import com.ssoftwares.funzo.json.PromoResponseJson;
import com.ssoftwares.funzo.json.RateRequestJson;
import com.ssoftwares.funzo.json.RateResponseJson;
import com.ssoftwares.funzo.json.RegisterRequestJson;
import com.ssoftwares.funzo.json.RegisterResponseJson;
import com.ssoftwares.funzo.json.ResponseJson;
import com.ssoftwares.funzo.json.SearchMerchantbyCatRequestJson;
import com.ssoftwares.funzo.json.StripeRequestJson;
import com.ssoftwares.funzo.json.TopupRequestJson;
import com.ssoftwares.funzo.json.TopupResponseJson;
import com.ssoftwares.funzo.json.WalletRequestJson;
import com.ssoftwares.funzo.json.WalletResponseJson;
import com.ssoftwares.funzo.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("customerapi/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("customerapi/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("customerapi/listkodepromo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("customerapi/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("customerapi/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("customerapi/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("customerapi/detail_fitur")
    Call<GetServiceResponseJson> getFitur();

    @POST("customerapi/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("customerapi/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("customerapi/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("customerapi/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("customerapi/stripeaction")
    Call<ResponseJson> actionstripe(@Body StripeRequestJson param);

    @POST("customerapi/intentstripe")
    Call<ResponseJson> intentstripe(@Body StripeRequestJson param);

    @POST("customerapi/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("customerapi/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("customerapi/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("customerapi/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("customerapi/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("customerapi/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("customerapi/detail_berita")
    Call<NewsDetailResponseJson> beritadetail(@Body NewsDetailRequestJson param);

    @POST("customerapi/all_berita")
    Call<NewsDetailResponseJson> allberita(@Body NewsDetailRequestJson param);

    @POST("customerapi/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
