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
}
