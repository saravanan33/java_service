package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaxFareDetail{
    @JsonProperty("PassengerType")
    public String passengerType;
    @JsonProperty("PassengerQuantity")
    public int passengerQuantity;
    @JsonProperty("CurrencyCode")
    public String currencyCode;
    @JsonProperty("Price")
    public Price price;
}
