package co.motorola.sb;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.cloud.config.server.EnableConfigServer;

@EnableJpaRepositories(basePackages = "co.motorola.sb.repository")
@SpringBootApplication
@ImportResource("classpath:spring-context.xml")
public class SbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApplication.class, args);
               
	}
}
