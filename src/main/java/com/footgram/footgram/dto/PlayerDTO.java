package com.footgram.footgram.dto;

import lombok.Data;

@Data
public class PlayerDTO {
  private String email;

  private String password;
  
  private String name;

  private byte age;

  private byte skillLevel;
}
