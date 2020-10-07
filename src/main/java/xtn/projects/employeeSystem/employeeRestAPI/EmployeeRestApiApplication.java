package xtn.projects.employeeSystem.employeeRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApiApplication.class, args);
	}

}
