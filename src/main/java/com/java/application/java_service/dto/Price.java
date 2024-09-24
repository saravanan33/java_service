package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Price{
    @JsonProperty("TotalAmount")
    public TotalAmount totalAmount;
    @JsonProperty("BaseAmount")
    public BaseAmount baseAmount;
    @JsonProperty("TaxAmount")
    public TaxAmount taxAmount;
    @JsonProperty("AirlineDiscount")
    public AirlineDiscount airlineDiscount;
    @JsonProperty("AgencyCommission")
    public AgencyCommission agencyCommission;
    @JsonProperty("AgencyYqCommission")
    public AgencyYqCommission agencyYqCommission;
    @JsonProperty("BookingFee")
    public BookingFee bookingFee;
    @JsonProperty("PortalMarkup")
    public PortalMarkup portalMarkup;
    @JsonProperty("PortalSurcharge")
    public PortalSurcharge portalSurcharge;
    @JsonProperty("PortalDiscount")
    public PortalDiscount portalDiscount;
    @JsonProperty("CommissionableTotalPrice")
    public CommissionableTotalPrice commissionableTotalPrice;
    @JsonProperty("CommissionableBasePrice")
    public CommissionableBasePrice commissionableBasePrice;
    @JsonProperty("Taxes")
    public ArrayList<Taxis> taxes;
}
