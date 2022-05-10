package com.demo.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.cardatabase.domain.Car;
import com.demo.cardatabase.domain.CarRepository;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean 
	CommandLineRunner runner () {
		return args -> {
			// Save demo data to DB
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 33545));
			repository.save(new Car("Dodge", "Challenger", "Black", "KK0--212", 2019, 38995));
			repository.save(new Car("Chevrolet", "Camaro", "Blue", "SSJ-3002", 2018, 37000));
		};
	}

}
