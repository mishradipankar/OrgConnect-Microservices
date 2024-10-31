package com.myproject.department_service;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest API",
				description = "Department Service RestAPI Documentaion",
				version="v1.0",
				contact =@Contact(
						name = "Dipankar",
						email = "mishra@gmail.com",
						url="mishra.com"
		),
				license = @License(
						name = "Apache 2.0",
						url = "abc.com"
				)

		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
