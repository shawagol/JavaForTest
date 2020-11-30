package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {


    @JsonProperty("Value")
    public Double value;
    @JsonProperty("Unit")
    public String unit;

    @JsonProperty("UnitType")
    public Integer unitType;



    public String toString() {
        return "температура:  " + value;
    }
}
