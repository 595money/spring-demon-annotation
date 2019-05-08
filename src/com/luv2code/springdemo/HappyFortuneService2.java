package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class HappyFortuneService2 implements FortuneService {

  @Override
  @Autowired
  public String getFortuneService() {
    return "Today is your lucky day22";
  }

}
