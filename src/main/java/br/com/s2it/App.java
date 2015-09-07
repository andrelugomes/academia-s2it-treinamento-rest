package br.com.s2it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = "br.com.s2it")
public class App {
  
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
