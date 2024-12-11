package com.example.demo.controller;


import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;
import io.swagger.v3.oas.models.headers.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;


    @GetMapping(value = "/weather/{city}")
    public Weather getWeatherByCity(@PathVariable("city") String city) {
        return weatherService.getWeather(city);
    }
}
