package com.example.demo.model;

import java.math.BigDecimal;

public class WeatherMind {

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getDeg() {
        return deg;
    }

    public void setDeg(BigDecimal deg) {
        this.deg = deg;
    }

    private BigDecimal speed;

    public WeatherMind() {
    }

    private BigDecimal deg;
}
