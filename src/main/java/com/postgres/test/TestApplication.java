package com.postgres.test;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

  private static final Logger log = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
	  SpringApplication.run(TestApplication.class);
	}

	@Bean
  public CommandLineRunner demo(UserRepository repository) {
	  return (args) -> {
      repository.save(new User("Jack"));
      repository.save(new User("Jack"));

      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (User customer : repository.findAll()) {
        log.info(customer.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      repository.findById(1L)
          .ifPresent(customer -> {
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
          });

      // fetch customers by last name
      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      repository.findByFirstName("Bauer").forEach(bauer -> {
        log.info(bauer.toString());
      });
      // for (Customer bauer : repository.findByLastName("Bauer")) {
      // 	log.info(bauer.toString());
      // }
      log.info("");
    };
  }
}
