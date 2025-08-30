package com.footgram.footgram.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footgram.footgram.models.CityModel;
import com.footgram.footgram.services.CitiesService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cities")
public class CitiesController {
  final CitiesService citiesService;

  CitiesController(CitiesService citiesService){
    this.citiesService = citiesService;
  }

  @GetMapping("")
  public ResponseEntity<List<CityModel>> getCities() {
      return ResponseEntity.status(HttpStatus.OK).body(citiesService.getCities());
  }
  
}
