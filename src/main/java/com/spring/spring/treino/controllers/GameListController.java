package com.spring.spring.treino.controllers;

import com.spring.spring.treino.dto.GameDTO;
import com.spring.spring.treino.dto.GameListDTO;
import com.spring.spring.treino.dto.GameMinDTO;
import com.spring.spring.treino.services.GameListService;
import com.spring.spring.treino.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }


}