package com.example.demo.service;

import com.example.demo.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class WeatherService {
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid=db5f2bf82f656b8998644e5b34aa9294";

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String city) {
        return restTemplate.exchange(WEATHER_URL,
                HttpMethod.GET, new HttpEntity<>(HttpHeaders.EMPTY),Weather.class, city).getBody();
    }
}
