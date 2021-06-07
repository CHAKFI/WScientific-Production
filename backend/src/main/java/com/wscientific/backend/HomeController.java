package com.wscientific.backend;
package org.angular_frontend.AppModule.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin

public class HomeController {

    @GetMapping("/")
    public String Home(){
      return "Welcome to Wscientific Production";

      public static void main(String[] args) {
        SpringApplication.run(wscientific.class, args);
    }
    }

}

