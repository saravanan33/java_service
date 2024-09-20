package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@Getter
@Setter
public class FareDetails {


    public TotalFareDetails totalFareDetails;
    public ArrayList<PaxFareDetail> paxFareDetails;

    public class AgencyCommission{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class AgencyYqCommission{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

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

    public class BaseAmount{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public int apiCurrencyPrice;
    }

    public class BaseFare{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public int apiCurrencyPrice;
    }

    public class BookingFee{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class BookingFeeInfo{
        @JsonProperty("FeeType")
        public String feeType;
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class CommissionableBasePrice{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class CommissionableTotalPrice{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
    }

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

    public class PortalDiscount{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class PortalMarkup{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class PortalSurcharge{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

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

    public class Tax{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class TaxAmount{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class Taxis{
        @JsonProperty("TaxCode")
        public String taxCode;
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
    }

    public class TotalAmount{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class TotalFare{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

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

    @Override
    public String toString() {
        return "FareDetails{" +
                "totalFareDetails=" + totalFareDetails +
                ", paxFareDetails=" + paxFareDetails +
                '}';
    }
}
