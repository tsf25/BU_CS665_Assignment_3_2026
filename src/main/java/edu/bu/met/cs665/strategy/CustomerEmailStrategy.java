/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Defines the common email generation behavior for customer types.
 */

package edu.bu.met.cs665.strategy;

/**  Defines the email generation behavior for different customer types. */
// Strategy interface defines the common behavior for all customer types.
// Reference: https://refactoring.guru/design-patterns/strategy

public interface CustomerEmailStrategy {
 
  /** Generates a personalized email using the provided base template. */
  String generateEmail(String baseTemplate);
}
