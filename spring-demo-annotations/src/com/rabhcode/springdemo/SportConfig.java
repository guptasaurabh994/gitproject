package com.rabhcode.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Configuration
//@Component("com.rabhcode.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// add support to resolve ${...} properties
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer
	 propertySourcesPlaceHolderConfigurer() {
	 
	 return new PropertySourcesPlaceholderConfigurer();
	 }

	//define bean for our sad fortune service
	@Bean
	public FortuneService sadfortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadfortuneService());
	}
}