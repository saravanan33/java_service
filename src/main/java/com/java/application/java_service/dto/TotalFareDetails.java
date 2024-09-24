package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TotalFareDetails{
    @JsonProperty("CurrencyCode")
    public String currencyCode;
    @JsonProperty("HstPercentage")
    public int hstPercentage;
    @JsonProperty("BaseFare")
    public BaseFare baseFare;
    @JsonProperty("BookingFeeInfo")
    public BookingFeeInfo bookingFeeInfo;
    @JsonProperty("Tax")
    public Tax tax;
    @JsonProperty("TotalFare")
    public TotalFare totalFare;
    @JsonProperty("AgencyCommission")
    public AgencyCommission agencyCommission;
    @JsonProperty("AgencyYqCommission")
    public AgencyYqCommission agencyYqCommission;
    @JsonProperty("PortalMarkup")
    public PortalMarkup portalMarkup;
    @JsonProperty("PortalSurcharge")
    public PortalSurcharge portalSurcharge;
    @JsonProperty("PortalDiscount")
    public PortalDiscount portalDiscount;
}
