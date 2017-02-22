package io.mcore.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableDiscoveryClient
public class VehiclesSimpleMicroserviceApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesSimpleMicroserviceApplication.class, args);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	  http.csrf().disable().cors().and().authorizeRequests()
		//.antMatchers("/other_matchers/**").access("<Expression>")
		.anyRequest().authenticated()
		.and().httpBasic();

	}
}
