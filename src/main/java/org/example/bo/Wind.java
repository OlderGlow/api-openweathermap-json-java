package org.example.bo;

import com.fasterxml.jackson.annotation.*;

public class Wind {
    double speed;
    int deg;

    @JsonProperty("speed")
    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public int getDeg() {
        return this.deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
