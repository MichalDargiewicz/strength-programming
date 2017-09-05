package io.dargenn.strengthprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties({LiquibaseProperties.class})
@Slf4j
public class StrengthProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrengthProgrammingApplication.class, args);
		log.debug("Running spring boot application!");
	}
}
