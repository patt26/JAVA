package com.learning.employeerestdemo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserRoles {

    @Bean
    public InMemoryUserDetailsManager Roles(){

        UserDetails jhon= User.builder()
                .username("jhon")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary=User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails scott=User.builder()
                .username("scott")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(mary,jhon,scott);


    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(config->
                config
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasAnyRole("EMPLOYEE","MANAGER")
                        .requestMatchers(HttpMethod.GET,"/api/employees/**").hasAnyRole("EMPLOYEE","MANAGER")
                        .requestMatchers(HttpMethod.POST,"/api/NewEmployees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.POST,"/api/BulkEmployees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT,"/api/employees/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"employees/sort/**").hasAnyRole("EMPLOYEE","MANAGER","ADMIN"));

        //for using basic http authentication
        http.httpBasic();

        // disable Cross Site Request Forgery (CSRF)beacause they do not contain any session tokens and sensitive info so..
        // if they contain session tokens or password then we must enable csrf 
        http.csrf().disable();

        return http.build();
    }


}
