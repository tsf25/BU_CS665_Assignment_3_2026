/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Implements the email generation strategy for frequent customers by 
 * recognizing their loyalty and expressing appreciation for their continued engagement.
 */

package edu.bu.met.cs665.strategy;

/** Generates personalized emails for frequent customers. */
public class FrequentCustomer implements CustomerEmailStrategy {

  @Override
  public String generateEmail(String baseTemplate) {
    return baseTemplate
        + "\n\nAs one of our frequent customers, "
        + "you are important to us. We appreciate your loyalty "
        + "and hope you continue enjoying our services.";
  }
}
