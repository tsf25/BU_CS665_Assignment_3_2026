/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Implements personalized email generation for returning customers.
 */

package edu.bu.met.cs665.strategy;

/** Generates personalized emails for returning customers. */
public class ReturningCustomer implements CustomerEmailStrategy {

  @Override
  public String generateEmail(String baseTemplate) {
    return baseTemplate
        + "\n\nThank you for choosing us again. "
        + "We appreciate your continued support "
        + "and look forward to serving you.";
  }
}
