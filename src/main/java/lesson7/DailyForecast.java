package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DailyForecast {

    @JsonProperty("Data")
    public  String data;
    @JsonProperty("EpochDate")
    public Integer epochDate;
    @JsonProperty("Temperature")
    public  TemperatureFiveDay temperatureFiveDay;
    @JsonProperty("Day")
    public Day  day;
    @JsonProperty("Night")
    public Night night;
    @JsonProperty("Sources")
    public List<String> sources = null;
    @JsonProperty("MobileLink")
    public String mobileLink ;
    @JsonProperty("Link")
    public String Link ;

    @Override
    public String toString() {
        return "Прогноз погоды на " +data + ", днем " + day.toString() + ", ночью " + night.toString() +
                "температура минимум: " +temperatureFiveDay.minimum +
                "температура максимум: " +temperatureFiveDay.maximum; }

}
