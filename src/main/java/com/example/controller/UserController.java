package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.BadRequestException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Transaction;
import com.example.model.TransactionRequest;
import com.example.model.User1;
import com.example.service.UserService;
import org.slf4j.Logger;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	    @Autowired
	    private UserService userService;
	    
	    @PostMapping
	    public User1 createUser(@RequestBody User1 user) {
	    	
	        return userService.createUser(user);
	    }
	    @PostMapping("/{userId}/transactions")
	    public Transaction addTransaction(@PathVariable Long userId, @RequestBody TransactionRequest transactionRequest) {
	        return userService.addTransaction(userId, transactionRequest);
	    }
	   
	    @GetMapping("/{userId}/balance")
	    public double getBalance(@PathVariable Long userId) {
	        return userService.getBalance(userId);
	    }

	    @GetMapping("/{userId}/transactions")
	    public List<Transaction> getTransactions(@PathVariable Long userId) {
	        return userService.getTransactions(userId);
	    }
	    @GetMapping("/{userId}")
	    public User1 getUserById(@PathVariable Long userId) {
	        return userService.getUserById(userId);
	    }
	}


