package com.banking.app;

import java.time.LocalDateTime;

import com.banking.app.enums.TransactionType;

public class Transaction {
  private TransactionType type;
  private double amount;
  private LocalDateTime time;
  private String note;

  Transaction(TransactionType type, double amount, String note) {
    this.type = type;
    this.amount = amount;
    this.time = LocalDateTime.now();
    this.note = note;
  }

  public String getTransactionDetails() {
    return  time + " | " + amount + " | " + type + " | " + note;
  }
}
