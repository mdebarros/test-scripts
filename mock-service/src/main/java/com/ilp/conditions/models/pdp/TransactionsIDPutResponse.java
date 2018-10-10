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
 * PUT /transactions/{ID} object
 */
public class TransactionsIDPutResponse {

  private String completedTimestamp = null;

  private String transactionState = null;

  private String code = null;

  private ExtensionList extensionList = null;

  public TransactionsIDPutResponse completedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
    return this;
  }

   /**
   * Time and date when the transaction was completed.
   * @return completedTimestamp
  **/
  public String getCompletedTimestamp() {
    return completedTimestamp;
  }

  public void setCompletedTimestamp(String completedTimestamp) {
    this.completedTimestamp = completedTimestamp;
  }

  public TransactionsIDPutResponse transactionState(String transactionState) {
    this.transactionState = transactionState;
    return this;
  }

   /**
   * State of the transaction.
   * @return transactionState
  **/
  public String getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(String transactionState) {
    this.transactionState = transactionState;
  }

  public TransactionsIDPutResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Optional redemption information provided to Payer after transaction has been completed.
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TransactionsIDPutResponse extensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
    return this;
  }

   /**
   * Get extensionList
   * @return extensionList
  **/
  public ExtensionList getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsIDPutResponse transactionsIDPutResponse = (TransactionsIDPutResponse) o;
    return Objects.equals(this.completedTimestamp, transactionsIDPutResponse.completedTimestamp) &&
        Objects.equals(this.transactionState, transactionsIDPutResponse.transactionState) &&
        Objects.equals(this.code, transactionsIDPutResponse.code) &&
        Objects.equals(this.extensionList, transactionsIDPutResponse.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedTimestamp, transactionState, code, extensionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsIDPutResponse {\n");
    
    sb.append("    completedTimestamp: ").append(toIndentedString(completedTimestamp)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
