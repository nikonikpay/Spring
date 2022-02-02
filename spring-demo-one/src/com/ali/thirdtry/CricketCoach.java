package com.ali.thirdtry;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;



    public CricketCoach() {
        System.out.println("Inside no arg cricket constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method in cricket class");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside the setter email in cricket class");

        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside the setter team in cricket class");

        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast in cricket class";
    }

    @Override
    public String getDailyFortune() {
        return "we are in cricket class"+fortuneService.getFortunes();
    }
}
