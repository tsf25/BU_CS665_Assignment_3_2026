# CS-665 Assignment 3
**Project:** Email Generation Application  
**Date:** November 2, 2026  
**Name:** Tiansheng Fu  
**Github Repository: https://github.com/tsf25/BU_CS665_Assignment_3_2026.git** 
---

## 1. Project Overview

This project implements an automated email generation application in Java. It generates personalized email messages for five different customer types:

- Business Customer
- Returning Customer
- Frequent Customer
- New Customer
- VIP Customer

Each customer type receives a different personalized message based on a shared base email template.

## 2. Code Organization

Based on feedback from the previous assignment, the project organizes related classes into separate packages. The customer strategies and email generator are kept separate to make the code easier to navigate and maintain.

## 3. Implementation

The application uses a common email template and adds customer-specific content through separate strategy classes.

`CustomerEmailStrategy` defines the common method for generating personalized email content. Each of the five customer classes implements this interface and provides its own version of the email message.

`EmailGenerator` acts as the context class. It holds a customer email strategy and delegates the email generation process to the selected strategy.

The application does not require a graphical user interface. JUnit tests demonstrate the email generation behavior for each customer type.

## 4. Design Pattern and Design Decisions

### Strategy Pattern

The Strategy Pattern is used to separate the email personalization behavior for each customer type.

Each customer class implements the same `CustomerEmailStrategy` interface but provides different email content. `EmailGenerator` can use any of these strategies without needing to know the specific implementation details.

This design allows the application to change its email personalization behavior by using a different strategy.

### Why Factory Pattern Was Not Used

The Factory Pattern was considered during the design process. However, the application only supports five known customer types, and each strategy can be instantiated directly.

Adding a factory would introduce another class and additional responsibility without providing enough benefit for this project's scope. Therefore, the Strategy Pattern alone provides a simpler solution.

## 5. Flexibility and Code Simplicity

The design makes it easier to support additional customer types. A new customer type can be added by creating another class that implements `CustomerEmailStrategy`. The existing email generation logic does not need to be rewritten.

The common interface also helps avoid duplicated control logic. Each customer class is responsible only for its own personalized message, while `EmailGenerator` handles the shared delegation process.

The implementation uses composition instead of inheritance. `EmailGenerator` has a `CustomerEmailStrategy` reference, allowing different strategies to be supplied through its constructor.

This keeps the classes independent, readable, and relatively simple to maintain.

## 6. Testing

JUnit 4 is used to test the email generation application.

The test class, `EmailGeneratorTest`, contains five test methods. Each test creates an `EmailGenerator` with a different customer strategy and verifies that the generated email matches the expected content.

All five tests passed successfully.

## 7. How to Build and Run

### Requirements

- Java 25
- Apache Maven
- Eclipse IDE or another Java IDE

### Run the Tests

Open a terminal in the project root directory, where `pom.xml` is located, and run:

```bash
mvn clean test
```

### Compile the Project

To compile the source code, run:

```bash
mvn clean compile
```

## 8. UML Class Diagram

The UML class diagram illustrates the relationship between `EmailGenerator`, the `CustomerEmailStrategy` interface, and the five customer strategy classes.


## 9. References

The following resources were consulted for design-pattern concepts and project development:

- Refactoring.Guru – Strategy Pattern: https://refactoring.guru/design-patterns/strategy
- GeeksforGeeks – Strategy Design Pattern in Java: https://www.geeksforgeeks.org/system-design/strategy-design-pattern-in-java/
- Baeldung – Strategy Pattern in Java: https://www.baeldung.com/java-strategy-pattern
- Professor's CS-665 Strategy Pattern Example: https://github.com/edorsini/cs-665-fall-2026/tree/main/strategy
- Professor's CS-665 Project Template: https://github.com/edorsini/cs-665-project-template