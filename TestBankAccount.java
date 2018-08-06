package ca.uwo.csd.cs2212.vyagnik;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

  @Test
  public void testDebitWithSufficientFunds() {
    BankAccount account = new BankAccount(10);
    double amount = amount.debit(5);
    Assert.assertEquals(5.0, amount);  
  }

}
