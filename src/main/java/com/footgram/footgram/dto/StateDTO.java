package com.footgram.footgram.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class StateDTO {
  @NotBlank(message = "State name is required")
  private String name;
}
