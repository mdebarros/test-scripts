/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Below are the allowed values for the enumeration - PAYER Sender of funds is initiating the transaction. The account to send from is either owned by the Payer or is connected to the Payer in some way. - PAYEE Recipient of the funds is initiating the transaction by sending a transaction request. The Payer must approve the transaction, either automatically by a pre-generated OTP or by pre-approval of the Payee, or by manually approving in his or her own Device.
 */
public enum TransactionInitiator {
  
  PAYER("PAYER"),
  
  PAYEE("PAYEE");

  private String value;

  TransactionInitiator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionInitiator fromValue(String text) {
    for (TransactionInitiator b : TransactionInitiator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

}
