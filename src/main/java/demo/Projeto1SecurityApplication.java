package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "security")
@ComponentScan(basePackages = "service")
@ComponentScan(basePackages = "controller")
@EnableJpaRepositories(basePackages = "repositories")
@EntityScan("model")
@SpringBootApplication
public class Projeto1SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1SecurityApplication.class, args);
	}
}