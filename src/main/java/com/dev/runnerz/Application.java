package com.dev.runnerz;

import com.dev.runnerz.run.Location;
import com.dev.runnerz.run.Run;
import com.dev.runnerz.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(RunRepository.class);

	public static void main(String[] args) {SpringApplication.run(Application.class, args);}

//	@Bean
//	CommandLineRunner runner(RunRepository runRepository)
//	{
//		return args ->
//		{
//			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 7, Location.INDOOR);
//			runRepository.create(run);
//		};
//	}

}
