package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.example.model.User1;
@EnableJpaRepositories

public interface UserRepository extends JpaRepository<User1, Long> {}

