package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Transaction;

import com.example.model.User1;

@EnableJpaRepositories

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	    List<Transaction> findByUserId(Long userId);
	}



