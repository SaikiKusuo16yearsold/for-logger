package com.example.demo.model;

public class Weather {

    private WethaerMain main;

    public WeatherMind getWind() {
        return wind;
    }

    public void setWind(WeatherMind wind) {
        this.wind = wind;
    }

    public WethaerMain getMain() {
        return main;
    }

    public void setMain(WethaerMain main) {
        this.main = main;
    }

    private WeatherMind wind;

    public Weather() {}
}
