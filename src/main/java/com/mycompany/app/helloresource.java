package com.mycompany.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {


       @GetMapping
	   public String hello(){
	        return "Helllo CitiusTech";
	   }

}
