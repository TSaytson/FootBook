package com.footgram.footgram.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footgram.footgram.models.CityModel;
import com.footgram.footgram.repositories.CitiesRepository;

@Service
public class CitiesService {
  final CitiesRepository citiesRepository;

  CitiesService(CitiesRepository citiesRepository){
    this.citiesRepository = citiesRepository;
  }

  public List<CityModel> getCities(){
    return citiesRepository.findAll();
  }
}
