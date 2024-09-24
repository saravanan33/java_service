package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookingFeeInfo{
    @JsonProperty("FeeType")
    public String feeType;
    @JsonProperty("BookingCurrencyPrice")
    public int bookingCurrencyPrice;
    @JsonProperty("EquivCurrencyPrice")
    public int equivCurrencyPrice;
}
