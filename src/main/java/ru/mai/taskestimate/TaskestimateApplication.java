package ru.mai.taskestimate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.mai.taskestimate.repository.StorageService;

@SpringBootApplication
public class TaskestimateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskestimateApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
