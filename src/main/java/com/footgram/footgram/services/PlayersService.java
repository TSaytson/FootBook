package com.footgram.footgram.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footgram.footgram.models.PlayerModel;
import com.footgram.footgram.repositories.PlayersRepository;

@Service
public class PlayersService {
  final PlayersRepository playersRepository;

  PlayersService(PlayersRepository playersRepository){
    this.playersRepository = playersRepository;
  }

  public List<PlayerModel> getPlayers(){
    return playersRepository.findAll();
  }
}
