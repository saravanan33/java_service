package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalAmount{
    @JsonProperty("BookingCurrencyPrice")
    public double bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public double equivCurrencyPrice;
    @JsonProperty("ApiCurrencyPrice")
    public double apiCurrencyPrice;
}
