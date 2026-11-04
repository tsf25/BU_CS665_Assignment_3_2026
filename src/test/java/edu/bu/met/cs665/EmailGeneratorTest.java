/**
 * CS-665 Assignment 3
 * Date: November 2, 2026
 * Name: Tiansheng Fu
 * Description: Tests personalized email generation for all five customer types to verify 
 * that each strategy produces the expected email content.
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.generator.EmailGenerator;
import edu.bu.met.cs665.strategy.BusinessCustomer;
import edu.bu.met.cs665.strategy.FrequentCustomer;
import edu.bu.met.cs665.strategy.NewCustomer;
import edu.bu.met.cs665.strategy.ReturningCustomer;
import edu.bu.met.cs665.strategy.VipCustomer;

/** Tests email generation for all supported customer types. */
//JUnit example: https://github.com/edorsini/cs-665-project-template

public class EmailGeneratorTest {

  private static final String BASE_TEMPLATE = "Hello, valued customer!";

  @Test
  public void testBusinessCustomerEmail() {
    // Given: a business customer and base email template
    EmailGenerator generator =
        new EmailGenerator(new BusinessCustomer());
    String expectedEmail = BASE_TEMPLATE
        + "\n\nWe appreciate your organization's partnership "
        + "and look forward to supporting your business needs.";

    // When: generating the personalized email
    String actualEmail = generator.generateEmail(BASE_TEMPLATE);

    // Then: the expected business email is returned
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  public void testReturningCustomerEmail() {
    // Given: a returning customer and base email template
    EmailGenerator generator =
        new EmailGenerator(new ReturningCustomer());
    String expectedEmail = BASE_TEMPLATE
        + "\n\nThank you for choosing us again. "
        + "We appreciate your continued support "
        + "and look forward to serving you.";

    // When: generating the personalized email
    String actualEmail = generator.generateEmail(BASE_TEMPLATE);

    // Then: the expected returning customer email is returned
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  public void testFrequentCustomerEmail() {
    // Given: a frequent customer and base email template
    EmailGenerator generator =
        new EmailGenerator(new FrequentCustomer());
    String expectedEmail = BASE_TEMPLATE
        + "\n\nAs one of our frequent customers, "
        + "you are important to us. We appreciate your loyalty "
        + "and hope you continue enjoying our services.";

    // When: generating the personalized email
    String actualEmail = generator.generateEmail(BASE_TEMPLATE);

    // Then: the expected frequent customer email is returned
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  public void testNewCustomerEmail() {
    // Given: a new customer and base email template
    EmailGenerator generator =
        new EmailGenerator(new NewCustomer());
    String expectedEmail = BASE_TEMPLATE
        + "\n\nWelcome! We are excited to have you as a new customer. "
        + "We look forward to providing you with a great experience.";

    // When: generating the personalized email
    String actualEmail = generator.generateEmail(BASE_TEMPLATE);

    // Then: the expected welcome email is returned
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  public void testVipCustomerEmail() {
    // Given: a VIP customer and base email template
    EmailGenerator generator =
        new EmailGenerator(new VipCustomer());
    String expectedEmail = BASE_TEMPLATE
        + "\n\nAs a valued VIP customer, you receive our highest level "
        + "of appreciation. Thank you for your continued trust "
        + "and loyalty.";

    // When: generating the personalized email
    String actualEmail = generator.generateEmail(BASE_TEMPLATE);

    // Then: the expected VIP email is returned
    assertEquals(expectedEmail, actualEmail);
  }
}
