/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Generates personalized customer emails by holding a customer email strategy 
 * and delegating the personalization process to the selected strategy.
 */

package edu.bu.met.cs665.generator;

import edu.bu.met.cs665.strategy.CustomerEmailStrategy;

/** Generates emails by delegating personalization to a customer strategy. */
public class EmailGenerator {
  // Reference: https://refactoring.guru/design-patterns/strategy
  private final CustomerEmailStrategy customerEmailStrategy;

  /** Creates an email generator using the selected customer strategy. */
  public EmailGenerator(CustomerEmailStrategy customerEmailStrategy) {
    if (customerEmailStrategy == null) {
      throw new IllegalArgumentException("Customer email strategy cannot be null.");
    }
    this.customerEmailStrategy = customerEmailStrategy;
  }

  /** Generates an email using the selected customer strategy. */
  // Reference: https://www.geeksforgeeks.org/system-design/strategy-design-pattern-in-java/
  public String generateEmail(String baseTemplate) {
    return customerEmailStrategy.generateEmail(baseTemplate);
  }
}
