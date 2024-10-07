Personal Finance Management System


Table of Contents

1. #overview
2. #user-stories
3. #acceptance-criteria
4. #technology-stack
5. #implementation-concepts
6. #features
7. #requirements
8. #installation
9. #usage
10. #api-documentation


Overview


The Personal Finance Management System is a web application designed to help users manage their income, expenses, and savings. The system provides basic functionality to add, view, and manage personal financial data.


User Stories


User Story 1: Welcome the User

- As a user, I want to be welcomed with a greeting when I open the application.
- Acceptance Criteria: The system should display “Hello, welcome to Personal Finance Management System!” when started.


User Story 2: Capture User Information

- As a user, I want to input my name and initial income.
- Acceptance Criteria: The system should prompt for the user’s name and income.


User Story 3: Manage Income and Expenses

- As a user, I want to add my income and expenses.
- Acceptance Criteria: The system should allow the user to input income or expenses.


User Story 4: Display Financial Summary

- As a user, I want to see a summary of my total income, expenses, and balance.
- Acceptance Criteria: The system should display the total income, expenses, and current balance when requested.


User Story 5: Store Transaction History

- As a user, I want to view the history of all my income and expense transactions.
- Acceptance Criteria: The system should store transactions in an array or list.


User Story 6: Implement Conditional Logic for Financial Health

- As a user, I want to get feedback on my financial health based on my balance.
- Acceptance Criteria: The system should display different messages based on the balance.


User Story 7: Categorize Expenses Using Switch Case

- As a user, I want to categorize my expenses for better management.
- Acceptance Criteria: The system should ask for an expense category using a switch-case.


User Story 8: View Financial Data Using Loops

- As a user, I want to loop through my transactions to view them in detail.
- Acceptance Criteria: The system should use loops to allow the user to view their transactions.


User Story 9: Advanced Data Storage with HashMaps

- As a user, I want to store my transactions in categories using HashMaps.
- Acceptance Criteria: The system should store expenses in categories using HashMaps.


User Story 10: Object-Oriented Financial Management

- As a developer, I want to use OOP principles to organize my financial data and operations.
- Acceptance Criteria: The system should use objects like User, Transaction, and Account.


Technology Stack


- Java
- Spring Boot
- JPA (Java Persistence API)
- Postman
- H2 Database
- HTML
- CSS
- Bootstrap
- ReactJS
- Axios


Implementation Concepts


- Variables
- Data Types
- Operators
- Strings
- User Input
- Conditional Statements
- Switch Cases
- Arrays/ArrayLists
- For/While/Do…While Loops
- HashMaps
- Object-Oriented Programming


Features


- Welcome message
- User information input
- Income and expense management
- Financial summary display
- Transaction history storage
- Conditional logic for financial health
- Expense categorization
- Loop-based transaction viewing
- HashMap-based data storage
- Object-Oriented Programming


Requirements


- Java 8 or higher
- Spring Boot 2.3 or higher
- H2 Database 1.4 or higher
- ReactJS 17 or higher


Installation


1. Clone the repository.
2. Install dependencies using Maven or Gradle.
3. Run the Spring Boot application.


Usage


1. Open the application in a web browser.
2. Follow the prompts to input user information.
3. Manage income and expenses.


API Documentation


API Endpoints


- /users: Create a new user.
- /transactions: Create a new transaction.
- /balance: Get the current balance.
- /transactions/history: Get transaction history.


API Request/Response Bodies


- User: { "name": "John Doe", "income": 5000 }
- Transaction: { "type": "income", "amount": 1000 }
- Balance: `{ "balance": 5000 }
