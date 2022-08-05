package com.example.dvdrental;


import com.example.dvdrental.repositories.CustomerRepository;
import com.example.dvdrental.repositories.MovieRepository;
import com.example.dvdrental.repositories.RentalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DvdrentalApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private RentalRepository rentalRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void repositoryTest() {

		// test from import.sql data seed values

		assertEquals(customerRepository.findById(1).get().getName(), "Bob");
		assertEquals(movieRepository.findById(2).get().getPriceCode(), 1);
		assertEquals(rentalRepository.findById(1).get().getMovie().getTitle(), "Star Wars: Episode I - The Phantom Menace");
		assertEquals(rentalRepository.findById(5).get().getDaysRented(), 5);

	}

}


