package com.shs.app;

import com.shs.app.propoties.AppPropoties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppPropoties.class)
public class MondayAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MondayAppApplication.class, args);
	}

}
