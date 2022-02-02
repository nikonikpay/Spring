package com.ali.thirdtry;

public class TrackCoach implements Coach {


    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "This is Track class";
    }

    @Override
    public String getDailyFortune() {
        return "Track class"+fortuneService.getFortunes();
    }
}
