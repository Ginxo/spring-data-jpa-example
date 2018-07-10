package com.example.springdatajpaexample;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository  extends CrudRepository<Player, Long> {
}
