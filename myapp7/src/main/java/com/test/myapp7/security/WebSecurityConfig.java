package com.test.myapp7.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
        .authorizeHttpRequests(
           request -> request.requestMatchers("/login").permitAll()
           .requestMatchers("/**").authenticated()
        )
        .formLogin(Customizer.withDefaults())      
        .logout(config -> config  
        .logoutUrl("/logout") 
        .logoutSuccessUrl("/login")) 
        .build();
    }
}
