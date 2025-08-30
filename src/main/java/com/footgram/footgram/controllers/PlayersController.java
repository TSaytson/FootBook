package com.footgram.footgram.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footgram.footgram.models.PlayerModel;
import com.footgram.footgram.services.PlayersService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/players")
public class PlayersController {
  final PlayersService playersService;

  PlayersController(PlayersService playersService){
    this.playersService = playersService;
  }

  @GetMapping("")
  public ResponseEntity<List<PlayerModel>> getPlayers() {
      return ResponseEntity.status(HttpStatus.OK).body(playersService.getPlayers());
  }
  
}
