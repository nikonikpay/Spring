package com.ali.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{


    @Override
    public String getFortunes() {
        return " inside happy fortune service Today is lucky  day";

    }
}
