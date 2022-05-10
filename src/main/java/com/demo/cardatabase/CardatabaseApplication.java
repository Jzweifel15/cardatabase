package com.demo.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.cardatabase.domain.Car;
import com.demo.cardatabase.domain.CarRepository;
import com.demo.cardatabase.domain.Owner;
import com.demo.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository crepository;

	@Autowired OwnerRepository orepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean 
	CommandLineRunner runner () {
		return args -> {
			// Add owner objects and save to DB
			Owner owner1 = new Owner("Dominic", "Toretto");
			Owner owner2 = new Owner("Brian", "O'Conner");
			orepository.save(owner1);
			orepository.save(owner2);

			// Add Car object with link to owners and save to DB
			Car car = new Car("Dodge", "Challenger", "Black", "KK0--212", 2019, 38995, owner1);
			crepository.save(car);

			car = new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 33545, owner2);
			crepository.save(car);

			car = new Car("Chevrolet", "Camaro", "Blue", "SSJ-3002", 2018, 37000, owner2);
			crepository.save(car);
		};
	}

}
