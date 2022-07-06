package org.example.bo;

import com.fasterxml.jackson.annotation.*;

public class Coord {
    double lon;
    double lat;

    @JsonProperty("lon")
    public double getLon() {
        return this.lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @JsonProperty("lat")
    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
