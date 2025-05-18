package com.example.progo;

import java.beans.Transient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class for starting the Progo application. 
 * progo is a goal accomplishing motivation toll. 
 * you can set goals and track daily achievements.
 */

 @SpringBootTest
 @autoconfigureMockMVv
@SpringBootApplication
public class ProgoApplication {
  /**
   * starting point of the app.
   *
   * @param args env variables.
   */
  public static void main(final String[] args) {
    SpringApplication.run(ProgoApplication.class, args);
  }

  @AutoWired
  private mockMvc mockmvc;


  @test
  public void testGetEndPoint(){
    mockmvc.perform(get(/עקא))

  }


  

}
