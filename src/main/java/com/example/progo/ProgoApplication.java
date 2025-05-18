package com.example.progo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class for starting the Progo application. 
 * progo is a goal accomplishing motivation toll. 
 * you can set goals and track daily achievements.
 */
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
}
