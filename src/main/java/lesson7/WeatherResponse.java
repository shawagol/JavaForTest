package lesson7;


import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse  {
@JsonProperty ("LocalObservationDataTime")
    public String localObservationDataTime;
    @JsonProperty ("EpochDateTime")
    public Integer epochDateTime ;
    @JsonProperty ("WeatherIcon")
    public Integer weatherIcon ;
    @JsonProperty ("IconPhrase")
    public String iconPhrase ;
    @JsonProperty ("HasPrecipitation")
    public  Boolean hasPrecipitation;
    @JsonProperty ("IsDaylight")
    public Boolean isDaylight ;
    @JsonProperty ("Temperature")
    public  Temperature temperature;
    @JsonProperty ("PrecipitationProbability")
    public  Integer precipitationProbability ;
    @JsonProperty ("MobileLink")
    public  String mobileLink;
    @JsonProperty ("Link")
    public  String link;

    public String toString() {
        return "Прогноз погоды на " + localObservationDataTime +  " ожидается - " + iconPhrase + temperature + "\r\n";}



}
