package com.footgram.footgram.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CityDTO {

  @NotBlank(message = "City name is required")
  private String name;

  @NotNull(message = "City must be associated to a state")
  @Positive
  private byte stateId;
}
