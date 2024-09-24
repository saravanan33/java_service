package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxis{
    @JsonProperty("TaxCode")
    public String taxCode;
    @JsonProperty("BookingCurrencyPrice")
    public double bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public double equivCurrencyPrice;
}
