package com.biller.patti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;

//exclude = {DataSourceAutoConfiguration.class,
//		DataSourceTransactionManagerAutoConfiguration.class,
//		HibernateJpaAutoConfiguration.class}
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.biller.patti",queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND)
public class PattiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PattiApplication.class, args);
	}

}
