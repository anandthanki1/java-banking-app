package com.banking.app;

import java.util.HashMap;

public class Bank {

  private HashMap<Integer, Account> accounts;
  private Integer nextAccountNumber;

  Bank() {
    this.accounts = new HashMap<>();
    nextAccountNumber = 100001;
  }

  public Account createAccount(String firstName, String lastName, String email, String pin) {
    Account account = new Account(firstName, lastName, email, pin);
    accounts.put(nextAccountNumber, account);
    System.out.println("Account is created and your account number is: " + nextAccountNumber);
    nextAccountNumber++;
    return account;
  }

  public Account authenticate(int accountNumber, String pin) {
    Account account = accounts.get(accountNumber);
    if(account != null && account.pin == pin) {
      // For pin comparison lets use hashing algorithm
      return account;
    }
    return null;
  }
  
}
