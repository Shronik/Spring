package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/list")
	public String list() {
		return "Application list 1.Knome 2.UX app 3.Fresco talk";
	}
	
	@GetMapping("/welcome")
	public String welcomeGuest() {
		return "Welcome to the Ultimatix Application";
	}
	
}