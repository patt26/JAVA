package com.learning.springcoredemo.config;

import com.learning.springcoredemo.Interface.ICoach;
import com.learning.springcoredemo.Model.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean("aquatic")
    public ICoach swimCoach(){
        return new SwimCoach();
    }
}
