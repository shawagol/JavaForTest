package lesson7;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureFiveDay {

    @JsonProperty("Maximum")
    public String maximum;


    @JsonProperty("Minimum")
    public String minimum;


    public String toString() {
        return "Минимальная температура:  " + minimum + ", максимальная температура:  " + maximum;
    }
}
