/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Implements the email generation strategy for business customers by adding 
 * a business-focused message to the base template.
 */

package edu.bu.met.cs665.strategy;

// Class reference: https://github.com/edorsini/cs-665-fall-2026/tree/main/strategy
// Reference: https://www.baeldung.com/java-strategy-pattern
// Reference: https://www.javacodegeeks.com/2019/09/strategy-design-pattern-java.html

/** Generates a personalized email for a business customer. */
public class BusinessCustomer implements CustomerEmailStrategy {

  @Override
  public String generateEmail(String baseTemplate) {
    return baseTemplate
        + "\n\nWe appreciate your organization's partnership "
        + "and look forward to supporting your business needs.";
  }
}
