package com.example.springdatajpaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping("/players")
    public List<Player> findAll() {
        return (List<Player>) repository.findAll();
    }

    @PostMapping("/players")
    public Player save(Player player) {
        return repository.save(player);
    }
}
