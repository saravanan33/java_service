package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommissionableBasePrice{
    @JsonProperty("BookingCurrencyPrice")
    public int bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public int equivCurrencyPrice;
}
