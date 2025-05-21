package com.devyunes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyunes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
