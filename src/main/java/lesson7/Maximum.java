package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maximum {


    @JsonProperty("Value")
    public Double value;
    @JsonProperty("unit")
    public String Unit;
    @JsonProperty("unitType")
    public Integer UnitType;

 public String toString(){
        return "Максимальная температура:  " + value;
    }
}