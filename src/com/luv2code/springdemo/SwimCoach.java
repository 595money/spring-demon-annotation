package com.luv2code.springdemo;

public class SwimCoach implements Coach {

  private FortuneService fortuneservice;

  public SwimCoach(FortuneService theFortuneservice) {
    fortuneservice = theFortuneservice;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1000 meters as a warm up.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneservice.getFortuneService();
  }

}
