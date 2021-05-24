package com.ourdevelops.ornids.constants;


import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Ourdevelops Team on 12/23/2019.
 */

public class Constant {

    private static final String BASE_URL = "https://funzo.ssdemo.xyz/";
    public static final String FCM_KEY = "AAAABwW0Ydk:APA91bHuHtQuidytaHs6Db4ot5qMYJb1fEL5yZmr8GXRYoe-2yvZMZpPovivuRV9OGpOBkEdmyhiy8qc1COZGamZyNOU5mS5DfaTP_0ugVuEybq705tGGn_XQprwoHxkOVKnCKL4dxi-";
    public static final String CONNECTION = BASE_URL + "api/";
    public static final String IMAGESFITUR = BASE_URL + "images/service/";
    public static final String IMAGESMERCHANT = BASE_URL + "images/merchant/";
    public static final String IMAGESBANK = BASE_URL + "images/bank/";
    public static final String IMAGESITEM = BASE_URL + "images/itemphoto/";
    public static final String IMAGESBERITA = BASE_URL + "images/news/";
    public static final String IMAGESSLIDER = BASE_URL + "images/promo/";
    public static final String IMAGESDRIVER = BASE_URL + "images/driverphoto/";
    public static final String IMAGESUSER = BASE_URL + "images/customer/";
    public static String CURRENCY = "";

    public static final int REJECT = 0;
    public static final int ACCEPT = 2;
    public static final int CANCEL = 5;
    public static final int START = 3;
    public static final int FINISH = 4;


    public static String TOKEN = "token";

    public static String USERID = "uid";

    public static String PREF_NAME = "pref_name";

    public static int permission_camera_code = 786;
    public static int permission_write_data = 788;
    public static int permission_Read_data = 789;
    public static int permission_Recording_audio = 790;

    public static SimpleDateFormat df =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    public static String versionname = "1.0";


}
