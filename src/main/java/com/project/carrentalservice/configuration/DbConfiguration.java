package com.project.carrentalservice.configuration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration //clasa de configurare din Spring
public class DbConfiguration {

    @Bean
    public DataSource getDataSource(){
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/car_rental_service")
                .username("user")
                .password("user")
                .build();
    }
    /*
    Create the schema:
    CREATE DATABASE car_rental_service;

    Create the same user and give him access to the schema:
    CREATE USER 'user'@'localhost' IDENTIFIED BY 'user';
    GRANT ALL PRIVILEGES ON car_rental_service.* TO 'user'@'localhost';
    FLUSH PRIVILEGES;
     */

    @Bean
    public SpringLiquibase getSpringLiquibase(){
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setChangeLog("classpath:db/changelog/liquibase-changelog.xml");
        springLiquibase.setDataSource(getDataSource());
        return springLiquibase;
    }
}
