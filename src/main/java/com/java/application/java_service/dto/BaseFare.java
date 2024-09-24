package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseFare{
    @JsonProperty("BookingCurrencyPrice")
    public int bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public int equivCurrencyPrice;
    @JsonProperty("ApiCurrencyPrice")
    public int apiCurrencyPrice;
}
