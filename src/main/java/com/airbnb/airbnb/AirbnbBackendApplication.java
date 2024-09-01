package com.airbnb.airbnb;

import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.PaymentStatu;
import com.airbnb.airbnb.entities.PaymentType;
import com.airbnb.airbnb.entities.Student;
import com.airbnb.airbnb.repository.PaymentRepository;
import com.airbnb.airbnb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class AirbnbBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbBackendApplication.class, args);
	}

}
