//package com.biller.patti.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableConfigurationProperties(DataSourceProperties.class)
//@EnableTransactionManagement
//public class DataSourceConfig {
//
//        @Autowired
//        DataSourceProperties dataSourceProperties;
//
//        @Bean
//        @Primary
//        public DataSource dataSource() {
//                DriverManagerDataSource dataSource = new DriverManagerDataSource();
//                dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//                dataSource.setUrl(dataSourceProperties.getUrl());
//                dataSource.setUsername(dataSourceProperties.getUsername());
//                dataSource.setPassword(dataSourceProperties.getPassword());
//                return dataSource;
//        }
//
//        @Bean
//        public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//                LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//                em.setDataSource(dataSource());
//                em.setPackagesToScan(new String[]{"com.biller.patti"});
//                JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//                em.setJpaVendorAdapter(vendorAdapter);
//                em.setJpaProperties(additionalProperties());
//                return em;
//        }
//
//        @Bean
//        public PlatformTransactionManager transactionManager() {
//                JpaTransactionManager transactionManager = new JpaTransactionManager();
//                transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//                return transactionManager;
//        }
//
//        @Bean
//        public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
//                return new PersistenceExceptionTranslationPostProcessor();
//        }
//
//        Properties additionalProperties() {
//                Properties properties = new Properties();
//                properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//                properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//
//                return properties;
//        }
//}