package com.spring.spring.treino.repositories;

import com.spring.spring.treino.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
