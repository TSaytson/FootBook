package com.footgram.footgram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.footgram.footgram.models.PlayerModel;

@Repository
public interface PlayersRepository extends JpaRepository<PlayerModel, Long> {

}
