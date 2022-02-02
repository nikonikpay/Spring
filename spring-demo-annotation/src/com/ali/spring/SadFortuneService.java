package com.ali.spring;

public class SadFortuneService implements FortuneService {


    @Override
    public String getFortunes() {
       return "we are inside sad fortune method";
    }
}
