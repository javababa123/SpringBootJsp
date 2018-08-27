package com.rrl;

import java.util.Arrays;
import java.util.StringTokenizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@EnableScheduling
@CrossOrigin(origins={"http://localhost:3000"})
public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("Main class");
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("starter");
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

		@Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**");
	            }
	        };
	    }
}