package com.footgram.footgram.models;

import com.footgram.footgram.dto.CityDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities")
public class CityModel {
  public CityModel(CityDTO city){
    this.name = city.getName();
  }

  public CityModel(CityDTO city, StateModel state){
    this.name = city.getName();
    this.state = new StateModel(state.getId(), state.getName());
  }

  @Id
  private byte Id;

  @Column()
  private String name;

  @ManyToOne()
  @JoinColumn(name = "stateId")
  private StateModel state;
}
