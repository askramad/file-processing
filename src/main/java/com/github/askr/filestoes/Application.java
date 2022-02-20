package com.github.askr.filestoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application
 * 
 * @author askr
 * 
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(Application.class);
        app.setWebEnvironment(false);
        ApplicationContext ctx = app.run(args);
        System.exit(SpringApplication.exit(ctx));
    }
}
