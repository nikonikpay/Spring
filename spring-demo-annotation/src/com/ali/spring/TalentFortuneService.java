package com.ali.spring;

import org.springframework.stereotype.Component;

@Component
public class TalentFortuneService implements FortuneService{


    @Override
    public String getFortunes() {
        return "This is talent fortune service";
    }
}
