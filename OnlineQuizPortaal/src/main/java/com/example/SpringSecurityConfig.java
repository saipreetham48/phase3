package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class SpringSecurityConfig extends  WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers("/protected").hasRole("USER")
        .antMatchers("/admin").hasRole("ADMIN")
        .antMatchers("/register").permitAll();
		 http.cors().and().csrf().disable();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder () {
		return new BCryptPasswordEncoder();
	}
	

}
