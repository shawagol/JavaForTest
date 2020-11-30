package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day {

    @JsonProperty("Icon")
    public Integer icon;
    @JsonProperty("IconPhrase")
    public String iconPhrase;
    @JsonProperty("HasPrecipitation")
    public  Boolean hasPrecipitation;
    @JsonProperty("PrecipitationType")
    public  String precipitationType;
    @JsonProperty("PrecipitationIntensity")
    public  String precipitationIntensity;

    public String toString() {
      return "погода:  " + iconPhrase;
  }
}
