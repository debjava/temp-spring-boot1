package com.ddlab.rnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class TestController {

  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello from Spring Boot";
  }
}
