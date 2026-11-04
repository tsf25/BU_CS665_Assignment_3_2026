/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Implements the email generation strategy for VIP customers by recognizing 
 * their special status and expressing appreciation for their continued trust and loyalty.
 */

package edu.bu.met.cs665.strategy;

/** Generates personalized emails for VIP customers. */
public class VipCustomer implements CustomerEmailStrategy {

  @Override
  public String generateEmail(String baseTemplate) {
    return baseTemplate
        + "\n\nAs a valued VIP customer, you receive our highest level "
        + "of appreciation. Thank you for your continued trust "
        + "and loyalty.";
  }
}
