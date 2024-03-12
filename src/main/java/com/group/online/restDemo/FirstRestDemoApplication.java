package com.group.online.restDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class FirstRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestDemoApplication.class, args);
	}


	@GetMapping("welcome")
	public String welcome(){
		return "Welcome here";
	}
@GetMapping ("welcome/{username}")
	public String welcomeWithUser(@PathVariable String username){

		return  "Welcome to online store : " + username;
	}
}






