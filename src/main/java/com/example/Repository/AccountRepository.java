package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Account;

import com.example.model.User1;
@EnableJpaRepositories

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUser(User1 user);}

