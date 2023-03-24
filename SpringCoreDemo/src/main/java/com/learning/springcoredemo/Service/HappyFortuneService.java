package com.learning.springcoredemo.Service;

import com.learning.springcoredemo.Interface.IFortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is your Lucky day";
    }
}
