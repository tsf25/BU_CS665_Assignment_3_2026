/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Implements the email generation strategy for new customers by 
 * welcoming them and introducing a positive first experience with the company.
 */

package edu.bu.met.cs665.strategy;

/** Generates personalized emails for new customers. */
public class NewCustomer implements CustomerEmailStrategy {

  @Override
  public String generateEmail(String baseTemplate) {
    return baseTemplate
        + "\n\nWelcome! We are excited to have you as a new customer. "
        + "We look forward to providing you with a great experience.";
  }
}
