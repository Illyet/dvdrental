package com.example.dvdrental.repositories;

import com.example.dvdrental.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
