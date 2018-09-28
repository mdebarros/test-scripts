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
 * Data model for the complex type PartyComplexName.
 */
public class PartyComplexName {

  private String firstName = null;

  private String middleName = null;

  private String lastName = null;

  public PartyComplexName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Party’s first name.
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PartyComplexName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Party’s middle name.
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PartyComplexName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Party’s last name.
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyComplexName partyComplexName = (PartyComplexName) o;
    return Objects.equals(this.firstName, partyComplexName.firstName) &&
        Objects.equals(this.middleName, partyComplexName.middleName) &&
        Objects.equals(this.lastName, partyComplexName.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyComplexName {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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