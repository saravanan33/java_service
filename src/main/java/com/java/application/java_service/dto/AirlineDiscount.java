package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AirlineDiscount{
    @JsonProperty("BookingCurrencyPrice")
    public int bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public int equivCurrencyPrice;
    @JsonProperty("AirlineDiscountDesc")
    public String airlineDiscountDesc;
    @JsonProperty("AirlineDiscountBreakup")
    public ArrayList<Object> airlineDiscountBreakup;
}
