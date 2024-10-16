package com.airbnb.airbnb;

import com.airbnb.airbnb.entities.Categorie;
import com.airbnb.airbnb.entities.Shop;
import com.airbnb.airbnb.entities.User;
import com.airbnb.airbnb.enums.Gender;
import com.airbnb.airbnb.repositories.CategorieRepository;
import com.airbnb.airbnb.repositories.ShopRepository;
import com.airbnb.airbnb.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class AirbnbBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbBackendApplication.class, args);
	}



}
