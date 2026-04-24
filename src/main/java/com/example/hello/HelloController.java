package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
	@GetMapping("/")	
	public ResponseEntity getRoles() {
		log.info("Returning hello");
		return ResponseEntity.ok().body("Hello");
	}
	
}
