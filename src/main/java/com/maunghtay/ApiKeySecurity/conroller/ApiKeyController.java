package com.maunghtay.ApiKeySecurity.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maunghtay.ApiKeySecurity.model.User;
import com.maunghtay.ApiKeySecurity.repository.UserRepo;

@RestController
public class ApiKeyController {

	@Autowired
	private UserRepo myUserRepo;
	
	@GetMapping("/api/hello")
    public List<User> helloWorld() {
		return myUserRepo.getAllUser();
	}		
	
}
