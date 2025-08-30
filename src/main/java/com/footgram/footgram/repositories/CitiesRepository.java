package com.footgram.footgram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.footgram.footgram.models.CityModel;

@Repository
public interface CitiesRepository extends JpaRepository<CityModel, Byte> {
  
}
