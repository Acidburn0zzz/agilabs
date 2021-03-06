/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Dec 11 18:22:09 CET 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Ownership
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_OwnershipEnum {

    // Other
    OTHER("Other"),
    // Private
    PRIVATE("Private"),
    // Public
    PUBLIC("Public"),
    // Subsidiary
    SUBSIDIARY("Subsidiary");

    final String value;

    private Account_OwnershipEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_OwnershipEnum fromValue(String value) {
        for (Account_OwnershipEnum e : Account_OwnershipEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
