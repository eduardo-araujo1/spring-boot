package com.spring.spring.treino.services;


import com.spring.spring.treino.dto.GameDTO;
import com.spring.spring.treino.dto.GameListDTO;
import com.spring.spring.treino.dto.GameMinDTO;
import com.spring.spring.treino.entities.Game;
import com.spring.spring.treino.entities.GameList;
import com.spring.spring.treino.repositories.GameListRepository;
import com.spring.spring.treino.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }


}
