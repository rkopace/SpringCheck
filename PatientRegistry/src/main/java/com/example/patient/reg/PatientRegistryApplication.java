package com.example.patient.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication    //@Configuration @EnableAutoConfiguration @ComponentScan
@EnableJpaAuditing
public class PatientRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientRegistryApplication.class, args);
		/*Friday I would like a java application of your own as a deliverable 
		  It should pull and write to a database as well as utilize a restful service*/
	}
}
