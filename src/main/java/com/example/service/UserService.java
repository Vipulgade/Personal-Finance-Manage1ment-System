package com.example.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.AccountRepository;
import com.example.Repository.TransactionRepository;
import com.example.Repository.UserRepository;
import com.example.model.Account;
import com.example.model.Transaction;
import com.example.model.TransactionRequest;
import com.example.model.User1;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public User1 createUser(User1 user) {
        // Save the user first
        User1 savedUser = userRepository.save(user);

        // Create the initial transaction
        Transaction transaction = new Transaction();
        transaction.setUser(savedUser);
        transaction.setType("income");
        transaction.setAmount(savedUser.getInitialIncome());
        transaction.setCategory("saving");
        transaction.setDate(LocalDateTime.now());
        transaction.setTotalBalance(savedUser.getInitialIncome());

        // Save the transaction
        transactionRepository.save(transaction);

        return savedUser;
    }
    

     public Transaction addTransaction(Long userId, TransactionRequest transactionRequest) {
         if (!userRepository.existsById(userId)) {
             throw new RuntimeException("User not found");
         }

         User1 user = userRepository.findById(userId)
             .orElseThrow(() -> new RuntimeException("User not found"));

         Transaction transaction = new Transaction();
         transaction.setUser(user);
         transaction.setType(transactionRequest.getType());
         transaction.setAmount(transactionRequest.getAmount());
         transaction.setCategory(transactionRequest.getCategory());
         transaction.setDate(LocalDateTime.now()); // Set the current date

         // Calculate the new total balance
         double newBalance;
         if ("income".equalsIgnoreCase(transactionRequest.getType())) {
             newBalance = user.getInitialIncome() + transactionRequest.getAmount();
         } else if ("expense".equalsIgnoreCase(transactionRequest.getType())) {
             newBalance = user.getInitialIncome() - transactionRequest.getAmount();
         } else {
             throw new IllegalArgumentException("Invalid transaction type");
         }

         transaction.setTotalBalance(newBalance);
         user.setInitialIncome(newBalance); // Update user's balance

         userRepository.save(user); // Save the updated user balance
         return transactionRepository.save(transaction);
     }


     public double getBalance(Long userId) {
         User1 user = userRepository.findById(userId)
             .orElseThrow(() -> new RuntimeException("User not found"));
         Account account=new Account();
         account.setBalance(user.getInitialIncome());
         account.setUser(user);
         accountRepository.save(account);
         return account.getBalance();
         
     }

    public List<Transaction> getTransactions(Long userId) {
             return transactionRepository.findByUserId(userId);
         }
     



    public User1 getUserById(Long userId) {
        return userRepository.findById(userId)
        		 .orElseThrow(() -> new RuntimeException("User not found"));
    }

}
