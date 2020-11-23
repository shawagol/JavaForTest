package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class lesson6 {
    private static  final String BASE_HOST = "dataservice.accuweather.com";
    private static  final String FORECAST = "forecasts";
    private static  final String API_VERSION = "v1";
    private static  final String FORECAST_TYPE = "hourly";
    private static  final String FORECAST_PERIOD= "12hour";
    private static  final String SAINT_PETERSBURG ="474212_PC";
    private static  final String API_KEY ="YJgKIzS2d81GEHZ5a0ahB5HQdmDF2LSr";


    public static void main(String[] args) throws IOException {
    OkHttpClient okHttpClient = new OkHttpClient();

    HttpUrl url = new HttpUrl.Builder()
    .scheme("http")
    .host(BASE_HOST)
            .addPathSegment(FORECAST)
            .addPathSegment(API_VERSION)
            .addPathSegment(FORECAST_TYPE)
            .addPathSegment(FORECAST_PERIOD)
            .addPathSegment(SAINT_PETERSBURG)
            .addQueryParameter("apikey", API_KEY)
            .addQueryParameter("language", "ru-ru")
            .addQueryParameter("details","true")
            .addQueryParameter("metric", "false")
            .build();
    System.out.println(url.toString());


    Request requestHttp = new Request.Builder()
            .addHeader("accept","application/json")
            .url(url)
            .build();


    String jsonResponse = okHttpClient.newCall(requestHttp).execute().body().string();
    System.out.println(jsonResponse);

        System.out.println("\n");
        Response responseHttp = okHttpClient.newCall(requestHttp).execute();
        System.out.println(responseHttp.code());
        System.out.println(responseHttp.headers());
        System.out.println(responseHttp.isRedirect());
        System.out.println(responseHttp.isSuccessful());
        System.out.println(responseHttp.protocol());
        System.out.println(responseHttp.receivedResponseAtMillis());
}

}
