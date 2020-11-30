package lesson7;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import lesson7.enums.Periods;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class AccuWeatherProvider implements WeatherProvider {
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST_ENDPOINT = "forecasts";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";

    private static  final String FORECAST = "forecasts";

    private static  final String FORECAST_TYPE = "daily";
    private static  final String FORECAST_PERIOD= "5day";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = ApplicationGlobalState.getInstance().getAPIKEY();

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void getWeather(Periods periods) throws IOException {
        String cityKey = detectCityKey();
        if (periods.equals(Periods.NOW)) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                    .addPathSegment(API_VERSION)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            String res = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<WeatherResponse> weatherResponse = objectMapper.readValue (res, new TypeReference<List<WeatherResponse>>() {});
            System.out.println(weatherResponse);
            //System.out.println(response.body().string());
        } else {
        periods.equals(Periods.FIVE_DAYS);
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(FORECAST)
                 //   .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                    .addPathSegment(API_VERSION)
                    .addPathSegment(FORECAST_TYPE)
                    .addPathSegment(FORECAST_PERIOD)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "ru-ru")
                    .addQueryParameter("details","true")
                    .addQueryParameter("metric", "false")
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
String res = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            DailyForecast responseDailyForecast = objectMapper.readValue(res,
                    new com.fasterxml.jackson.core.type.TypeReference<DailyForecast>() {
            });
            System.out.println(response.body().string());
        }

    }
        public String detectCityKey () throws IOException {
            String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();
            HttpUrl detectLocationURL = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment("locations")
                    .addPathSegment(API_VERSION)
                    .addPathSegment("cities")
                    .addPathSegment("autocomplete")
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("q", selectedCity)
                    .build();
            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(detectLocationURL)
                    .build();
            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                throw new IOException("Невозможно прочесть информацию о городе. " +
                        "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
            }

            String jsonResponse = response.body().string();
            System.out.println("Произвожу поиск города " + selectedCity);


            if (objectMapper.readTree(jsonResponse).size() > 0) {
                String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
                String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
                System.out.println("Найден город " + cityName + " в стране " + countryName);
            } else throw new IOException("Сервер вернул ноль городов");
            return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
        }


}
