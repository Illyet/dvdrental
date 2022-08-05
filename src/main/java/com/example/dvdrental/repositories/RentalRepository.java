package com.example.dvdrental.repositories;

import com.example.dvdrental.entities.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Integer> {
}
