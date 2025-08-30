package com.footgram.footgram.models;

import com.footgram.footgram.dto.PlayerDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class PlayerModel {
  public PlayerModel(PlayerDTO player){
    this.email = player.getEmail();
    this.password = player.getPassword();
    this.name = player.getName();
    this.age = player.getAge();
    this.skillLevel = player.getSkillLevel();
  }

  @Id
  private long id;

  @Column
  private String email;

  @Column
  private String password;
  
  @Column
  private String name;

  @Column
  private byte age;

  @Column
  private byte skillLevel;
}
