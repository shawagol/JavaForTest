package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Night {

    @JsonProperty("Icon")
    public Integer icon ;
    @JsonProperty("iconPhrase")
    public  String iconPhrase;
    @JsonProperty("HasPrecipitation")
    public Boolean hasPrecipitation;

    public String toString() {
        return "погода:  " + iconPhrase;
    }
}
