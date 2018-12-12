
package com.capgemini.training.customer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CUSTOMER_ID",
    "EMAIL",
    "PERMISSION"
})
public class Example {

    @JsonProperty("CUSTOMER_ID")
    private String cUSTOMERID;
    @JsonProperty("EMAIL")
    private String eMAIL;
    @JsonProperty("PERMISSION")
    private Permission permission;
    @JsonIgnore

    @JsonProperty("CUSTOMER_ID")
    public String getCUSTOMERID() {
        return cUSTOMERID;
    }

    @JsonProperty("CUSTOMER_ID")
    public void setCUSTOMERID(String cUSTOMERID) {
        this.cUSTOMERID = cUSTOMERID;
    }

    @JsonProperty("EMAIL")
    public String getEMAIL() {
        return eMAIL;
    }

    @JsonProperty("EMAIL")
    public void setEMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    @JsonProperty("PERMISSION")
    public Permission getPERMISSION() {
        return permission;
    }

    @JsonProperty("PERMISSION")
    public void setPERMISSION(Permission permission) {
        this.permission = permission;
    }


}
