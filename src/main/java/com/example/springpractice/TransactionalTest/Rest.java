package com.example.springpractice.TransactionalTest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@PostMapping("/transactional/restcontroller/normal")
	public void restTransactionalNormal() {
	
	}
	
	@PostMapping("/transactional/restcontroller/rollback")
	public void restTransactionalRollback() {
	
	}
	
}
