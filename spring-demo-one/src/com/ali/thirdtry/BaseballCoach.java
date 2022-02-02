package com.ali.thirdtry;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily Workout IS in baseBallcoach";
    }

    @Override
    public String getDailyFortune() {

        //use my fortune service to get a fortune
        return fortuneService.getFortunes();
    }

}
