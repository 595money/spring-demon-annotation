package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  //  若未對其他class 標註 @Compenet 、 @Bean 則需要標註 @ComponentScan
public class SportConfig {
  // defime bean for our sad fortune service
  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  // define bean for our swim coach AND inject dependency
  @Bean
  public Coach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }
}
