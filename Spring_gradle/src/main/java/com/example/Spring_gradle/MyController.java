package com.example.Spring_gradle

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/display")
	public String getMessage() {
		return " you successfully integrated and created war";
	}

}