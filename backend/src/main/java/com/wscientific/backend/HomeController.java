package com.wscientific.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class HomeController {

    @GetMapping("/")
    public String Home(){
      return "Hello from SpringBoot CASABLANCA by chakfi";
    }

}
