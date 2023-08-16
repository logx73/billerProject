package com.biller.patti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;

//exclude = {DataSourceAutoConfiguration.class,
//		DataSourceTransactionManagerAutoConfiguration.class,
//		HibernateJpaAutoConfiguration.class}
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.biller.patti")
public class PattiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PattiApplication.class, args);
	}

}
