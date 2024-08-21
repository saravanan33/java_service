package com.java.application.java_service.response;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import java.util.ArrayList;
import java.util.Date;

public class response {

/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
    public class ACH{
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class ADT{
        @JsonProperty("F")
        public int f;
        @JsonProperty("P")
        public int p;
        @JsonProperty("AllowedMarkup")
        public int allowedMarkup;
        @JsonProperty("UtilizedMarkup")
        public int utilizedMarkup;
        @JsonProperty("BalanceMarkup")
        public int balanceMarkup;
    }

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

    public class AirlineCharge{
        @JsonProperty("BuyingFare")
        public double buyingFare;
        @JsonProperty("SellingFare")
        public double sellingFare;
        @JsonProperty("AirlineCharge")
        public double airlineCharge;
        @JsonProperty("ReqAirlineCharge")
        public double reqAirlineCharge;
        @JsonProperty("ReqTotalFare")
        public double reqTotalFare;
        @JsonProperty("FareType")
        public String fareType;
        @JsonProperty("OrgFareType")
        public String orgFareType;
        @JsonProperty("OfferID")
        public String offerID;
        @JsonProperty("Owner")
        public String owner;
        @JsonProperty("MultipleFop")
        public String multipleFop;
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

    public class AirlineMaxMarkupInfo{
        @JsonProperty("FareType")
        public String fareType;
        @JsonProperty("GdsSource")
        public String gdsSource;
        @JsonProperty("IsMarkupAllowed")
        public boolean isMarkupAllowed;
        @JsonProperty("AllPaxMaxMarkup")
        public int allPaxMaxMarkup;
        @JsonProperty("TemplateId")
        public int templateId;
        @JsonProperty("TemplateName")
        public String templateName;
        @JsonProperty("CalculationOn")
        public String calculationOn;
        @JsonProperty("ShouldNotExceedPub")
        public String shouldNotExceedPub;
        @JsonProperty("RestrictAsCap")
        public String restrictAsCap;
        @JsonProperty("MarkupDetails")
        public MarkupDetails markupDetails;
        @JsonProperty("Currency")
        public String currency;
        @JsonProperty("MarkupExcRate")
        public int markupExcRate;
    }

    public class AirlineOffer{
        @JsonProperty("AirlineOfferSnapshot")
        public AirlineOfferSnapshot airlineOfferSnapshot;
        @JsonProperty("Offer")
        public ArrayList<Offer> offer;
    }

    public class AirlineOfferSnapshot{
        @JsonProperty("PassengerQuantity")
        public int passengerQuantity;
    }

    public class AirShoppingRS{
        @JsonProperty("Document")
        public Document document;
        @JsonProperty("Party")
        public Party party;
        @JsonProperty("ShoppingResponseId")
        public String shoppingResponseId;
        @JsonProperty("Success")
        public Success success;
        @JsonProperty("OffersGroup")
        public OffersGroup offersGroup;
        @JsonProperty("DataLists")
        public DataLists dataLists;
        @JsonProperty("Metadata")
        public Metadata metadata;
    }

    public class AllowedMarkup{
    }

    public class ApiPrice{
        @JsonProperty("TotalAmount")
        public double totalAmount;
        @JsonProperty("BaseAmount")
        public int baseAmount;
        @JsonProperty("TaxAmount")
        public double taxAmount;
        @JsonProperty("YqTaxAmount")
        public double yqTaxAmount;
        @JsonProperty("YrTaxAmount")
        public int yrTaxAmount;
    }

    public class Arrival{
        @JsonProperty("AirportCode")
        public String airportCode;
        @JsonProperty("Date")
        public String date;
        @JsonProperty("Time")
        public String time;
        @JsonProperty("AirportName")
        public String airportName;
        @JsonProperty("Terminal")
        public Terminal terminal;
    }

    public class AX{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

    public class Baggage{
        @JsonProperty("Allowance")
        public int allowance;
        @JsonProperty("Unit")
        public String unit;
    }

    public class BaseAmount{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public int apiCurrencyPrice;
    }

    public class BasePrice{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
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

    public class BrandTextInfo{
        @JsonProperty("Code")
        public String code;
        @JsonProperty("Type")
        public String type;
        @JsonProperty("Text")
        public String text;
    }

    public class CancelFeeAfter{
        @JsonProperty("BookingCurrencyPrice")
        public String bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public String equivCurrencyPrice;
    }

    public class CancelFeeBefore{
        @JsonProperty("BookingCurrencyPrice")
        public Object bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public Object equivCurrencyPrice;
    }

    public class CASH{
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class CC{
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class ChangeFeeAfter{
        @JsonProperty("BookingCurrencyPrice")
        public Object bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public Object equivCurrencyPrice;
    }

    public class ChangeFeeBefore{
        @JsonProperty("BookingCurrencyPrice")
        public Object bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public Object equivCurrencyPrice;
    }

    public class CHEQUE{
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class ClassOfService{
        @JsonProperty("SegementRef")
        public String segementRef;
        @JsonProperty("Code")
        public Code code;
        @JsonProperty("MarketingName")
        public String marketingName;
        @JsonProperty("Carrier")
        public String carrier;
        @JsonProperty("Cabin")
        public String cabin;
        @JsonProperty("MediaInfoRefKey")
        public String mediaInfoRefKey;
        @JsonProperty("FareBasisCode")
        public String fareBasisCode;
        @JsonProperty("Baggage")
        public Baggage baggage;
        @JsonProperty("Meal")
        public String meal;
    }

    public class Code{
        @JsonProperty("MarriageGroup")
        public String marriageGroup;
        @JsonProperty("ResBookDesigCode")
        public String resBookDesigCode;
        @JsonProperty("Cabin")
        public String cabin;
        @JsonProperty("SeatsLeft")
        public int seatsLeft;
        @JsonProperty("Value")
        public String value;
    }

    public class CommissionableBasePrice{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
    }

    public class CommissionablePerPerson{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
    }

    public class CommissionableTotalPrice{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("SortEquivCurrencyPrice")
        public double sortEquivCurrencyPrice;
    }

    public class Contact{
        @JsonProperty("EmailContact")
        public String emailContact;
    }

    public class Contacts{
        @JsonProperty("Contact")
        public ArrayList<Contact> contact;
    }

    public class DataLists{
        @JsonProperty("PassengerList")
        public PassengerList passengerList;
        @JsonProperty("DisclosureList")
        public DisclosureList disclosureList;
        @JsonProperty("FareList")
        public FareList fareList;
        @JsonProperty("FlightSegmentList")
        public FlightSegmentList flightSegmentList;
        @JsonProperty("FlightList")
        public FlightList flightList;
        @JsonProperty("OriginDestinationList")
        public OriginDestinationList originDestinationList;
        @JsonProperty("PriceClassList")
        public PriceClassList priceClassList;
        @JsonProperty("SuppliersList")
        public ArrayList<Integer> suppliersList;
        @JsonProperty("FopList")
        public ArrayList<FopList> fopList;
        @JsonProperty("CpList")
        public ArrayList<Object> cpList;
        @JsonProperty("IsSearchRuleEngineEnabled")
        public String isSearchRuleEngineEnabled;
    }

    public class DC{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class Departure{
        @JsonProperty("AirportCode")
        public String airportCode;
        @JsonProperty("Date")
        public String date;
        @JsonProperty("Time")
        public String time;
        @JsonProperty("AirportName")
        public String airportName;
        @JsonProperty("Terminal")
        public Terminal terminal;
    }

    public class DisclosureList{
        @JsonProperty("Disclosures")
        public ArrayList<Object> disclosures;
    }

    public class Document{
        @JsonProperty("Name")
        public String name;
        @JsonProperty("ReferenceVersion")
        public String referenceVersion;
    }

    public class DUS{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

    public class Equipment{
        @JsonProperty("AircraftCode")
        public String aircraftCode;
        @JsonProperty("Name")
        public String name;
    }

    public class F{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class FareComponent{
        @JsonProperty("PriceClassRef")
        public String priceClassRef;
        @JsonProperty("SegmentRefs")
        public String segmentRefs;
    }

    public class FareDetail{
        @JsonProperty("PassengerRefs")
        public String passengerRefs;
        @JsonProperty("Price")
        public Price price;
        @JsonProperty("ApiPrice")
        public ApiPrice apiPrice;
    }

    public class FareList{
        @JsonProperty("FareGroup")
        public ArrayList<Object> fareGroup;
    }

    public class Flight{
        @JsonProperty("FlightKey")
        public String flightKey;
        @JsonProperty("Journey")
        public Journey journey;
        @JsonProperty("LayoverTime")
        public LayoverTime layoverTime;
        @JsonProperty("SegmentReferences")
        public String segmentReferences;
    }

    public class FlightDetail{
        @JsonProperty("FlightDuration")
        public FlightDuration flightDuration;
        @JsonProperty("Stops")
        public Stops stops;
        @JsonProperty("InterMediate")
        public ArrayList<Object> interMediate;
        @JsonProperty("AirMilesFlown")
        public int airMilesFlown;
    }

    public class FlightDuration{
        @JsonProperty("Value")
        public String value;
    }

    public class FlightList{
        @JsonProperty("Flight")
        public ArrayList<Flight> flight;
    }

    public class FlightSegment{
        @JsonProperty("SegmentKey")
        public String segmentKey;
        @JsonProperty("Departure")
        public Departure departure;
        @JsonProperty("Arrival")
        public Arrival arrival;
        @JsonProperty("MarketingCarrier")
        public MarketingCarrier marketingCarrier;
        @JsonProperty("OperatingCarrier")
        public OperatingCarrier operatingCarrier;
        @JsonProperty("Equipment")
        public Equipment equipment;
        @JsonProperty("Code")
        public Code code;
        @JsonProperty("FlightDetail")
        public FlightDetail flightDetail;
        @JsonProperty("BrandId")
        public String brandId;
    }

    public class FlightSegmentList{
        @JsonProperty("FlightSegment")
        public ArrayList<FlightSegment> flightSegment;
    }

    public class FopList{
        @JsonProperty("CC")
        public CC cC;
        @JsonProperty("DC")
        public DC dC;
        @JsonProperty("CASH")
        public CASH cASH;
        @JsonProperty("CHEQUE")
        public CHEQUE cHEQUE;
        @JsonProperty("ACH")
        public ACH aCH;
        @JsonProperty("PG")
        public PG pG;
        @JsonProperty("FopKey")
        public String fopKey;
    }

    public class ItinTax{
        @JsonProperty("TaxCode")
        public String taxCode;
        @JsonProperty("ApiAmount")
        public double apiAmount;
        @JsonProperty("PosAmount")
        public double posAmount;
        @JsonProperty("ReqAmount")
        public double reqAmount;
        @JsonProperty("TaxLine")
        public int taxLine;
        @JsonProperty("PosApiAmount")
        public double posApiAmount;
        @JsonProperty("ReqApiAmount")
        public double reqApiAmount;
    }

    public class JC{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

    public class Journey{
        @JsonProperty("Time")
        public String time;
        @JsonProperty("Stops")
        public int stops;
    }

    public class LayoverTime{
        @JsonProperty("Segment1")
        public String segment1;
        @JsonProperty("Segment2")
        public String segment2;
        @JsonProperty("Segment3")
        public String segment3;
        @JsonProperty("Segment4")
        public String segment4;
        @JsonProperty("Segment5")
        public String segment5;
        @JsonProperty("Segment6")
        public String segment6;
        @JsonProperty("Segment7")
        public String segment7;
        @JsonProperty("Segment8")
        public String segment8;
        @JsonProperty("Segment9")
        public String segment9;
        @JsonProperty("Segment10")
        public String segment10;
        @JsonProperty("Segment11")
        public String segment11;
        @JsonProperty("Segment12")
        public String segment12;
        @JsonProperty("Segment13")
        public String segment13;
        @JsonProperty("Segment14")
        public String segment14;
        @JsonProperty("Segment15")
        public String segment15;
        @JsonProperty("Segment16")
        public String segment16;
        @JsonProperty("Segment17")
        public String segment17;
        @JsonProperty("Segment18")
        public String segment18;
        @JsonProperty("Segment19")
        public String segment19;
        @JsonProperty("Segment20")
        public String segment20;
        @JsonProperty("Segment21")
        public String segment21;
        @JsonProperty("Segment22")
        public String segment22;
        @JsonProperty("Segment23")
        public String segment23;
        @JsonProperty("Segment24")
        public String segment24;
        @JsonProperty("Segment25")
        public String segment25;
        @JsonProperty("Segment26")
        public String segment26;
        @JsonProperty("Segment27")
        public String segment27;
        @JsonProperty("Segment28")
        public String segment28;
        @JsonProperty("Segment29")
        public String segment29;
        @JsonProperty("Segment30")
        public String segment30;
        @JsonProperty("Segment31")
        public String segment31;
        @JsonProperty("Segment32")
        public String segment32;
        @JsonProperty("Segment33")
        public String segment33;
        @JsonProperty("Segment34")
        public String segment34;
        @JsonProperty("Segment35")
        public String segment35;
        @JsonProperty("Segment36")
        public String segment36;
        @JsonProperty("Segment37")
        public String segment37;
        @JsonProperty("Segment38")
        public String segment38;
        @JsonProperty("Segment39")
        public String segment39;
        @JsonProperty("Segment40")
        public String segment40;
        @JsonProperty("Segment41")
        public String segment41;
        @JsonProperty("Segment42")
        public String segment42;
        @JsonProperty("Segment43")
        public String segment43;
        @JsonProperty("Segment44")
        public String segment44;
        @JsonProperty("Segment45")
        public String segment45;
        @JsonProperty("Segment46")
        public String segment46;
        @JsonProperty("Segment47")
        public String segment47;
        @JsonProperty("Segment48")
        public String segment48;
        @JsonProperty("Segment49")
        public String segment49;
        @JsonProperty("Segment50")
        public String segment50;
    }

    public class MA{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

    public class MarketingCarrier{
        @JsonProperty("AirlineID")
        public String airlineID;
        @JsonProperty("Name")
        public String name;
        @JsonProperty("FlightNumber")
        public String flightNumber;
        @JsonProperty("OrgAirlineID")
        public String orgAirlineID;
    }

    public class MarkupDetails{
        @JsonProperty("ADT")
        public ADT aDT;
    }

    public class MC{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

    public class Metadata{
        @JsonProperty("PriceMetadatas")
        public PriceMetadatas priceMetadatas;
    }

    public class Offer{
        @JsonProperty("OfferID")
        public String offerID;
        @JsonProperty("RecommededFareID")
        public int recommededFareID;
        @JsonProperty("TicketingBotAgentMarkup")
        public int ticketingBotAgentMarkup;
        @JsonProperty("Owner")
        public String owner;
        @JsonProperty("OrgOwner")
        public String orgOwner;
        @JsonProperty("OwnerName")
        public String ownerName;
        @JsonProperty("FareType")
        public String fareType;
        @JsonProperty("OrgFareType")
        public String orgFareType;
        @JsonProperty("IsTaxModified")
        public String isTaxModified;
        @JsonProperty("MinOneAdultAgeRequired")
        public String minOneAdultAgeRequired;
        @JsonProperty("SalutationRequired")
        public String salutationRequired;
        @JsonProperty("3ds2PaymentRequired")
        public String _3ds2PaymentRequired;
        @JsonProperty("InstantTicket")
        public String instantTicket;
        @JsonProperty("ItinMergeType")
        public String itinMergeType;
        @JsonProperty("BrandName")
        public String brandName;
        @JsonProperty("IsBrandedFare")
        public String isBrandedFare;
        @JsonProperty("BrandedFareOptions")
        public ArrayList<String> brandedFareOptions;
        @JsonProperty("OnewayBrandedOptions")
        public ArrayList<Object> onewayBrandedOptions;
        @JsonProperty("OnewayCabinOptions")
        public ArrayList<Object> onewayCabinOptions;
        @JsonProperty("BrandTextInfo")
        public ArrayList<BrandTextInfo> brandTextInfo;
        @JsonProperty("PccIdentifier")
        public String pccIdentifier;
        @JsonProperty("PCC")
        public String pCC;
        @JsonProperty("ProviderCode")
        public String providerCode;
        @JsonProperty("ContentSourceId")
        public int contentSourceId;
        @JsonProperty("TicketContentSourceId")
        public int ticketContentSourceId;
        @JsonProperty("ProviderInfo")
        public String providerInfo;
        @JsonProperty("CabinType")
        public String cabinType;
        @JsonProperty("CabinOptions")
        public ArrayList<Object> cabinOptions;
        @JsonProperty("IsAdditionalCabinType")
        public String isAdditionalCabinType;
        @JsonProperty("SsrRequestAllowed")
        public String ssrRequestAllowed;
        @JsonProperty("Eticket")
        public String eticket;
        @JsonProperty("PaymentMode")
        public String paymentMode;
        @JsonProperty("AllowHold")
        public String allowHold;
        @JsonProperty("AllowPassengerEmail")
        public String allowPassengerEmail;
        @JsonProperty("RestrictedFare")
        public String restrictedFare;
        @JsonProperty("OfferExpirationDateTime")
        public String offerExpirationDateTime;
        @JsonProperty("NationalityRequired")
        public String nationalityRequired;
        @JsonProperty("PassportRequired")
        public String passportRequired;
        @JsonProperty("IsBaggageRequired")
        public String isBaggageRequired;
        @JsonProperty("IsMealRequired")
        public String isMealRequired;
        @JsonProperty("IsSeatRequired")
        public String isSeatRequired;
        @JsonProperty("BookingCurrencyCode")
        public String bookingCurrencyCode;
        @JsonProperty("EquivCurrencyCode")
        public String equivCurrencyCode;
        @JsonProperty("HstPercentage")
        public int hstPercentage;
        @JsonProperty("MediaInfoDataRefKey")
        public String mediaInfoDataRefKey;
        @JsonProperty("TsaIssuingCountryRequired")
        public String tsaIssuingCountryRequired;
        @JsonProperty("SortTotal")
        public double sortTotal;
        @JsonProperty("CommissionableSortTotal")
        public double commissionableSortTotal;
        @JsonProperty("CSCountry")
        public String cSCountry;
        @JsonProperty("FlightComKeyOrg")
        public String flightComKeyOrg;
        @JsonProperty("GfsFlightComKey")
        public String gfsFlightComKey;
        @JsonProperty("RewardSettings")
        public RewardSettings rewardSettings;
        @JsonProperty("BookingFeeInfo")
        public BookingFeeInfo bookingFeeInfo;
        @JsonProperty("TotalPrice")
        public TotalPrice totalPrice;
        @JsonProperty("AirlineDiscount")
        public AirlineDiscount airlineDiscount;
        @JsonProperty("PerPerson")
        public PerPerson perPerson;
        @JsonProperty("PerPersonRounded")
        public PerPersonRounded perPersonRounded;
        @JsonProperty("BasePrice")
        public BasePrice basePrice;
        @JsonProperty("TaxPrice")
        public TaxPrice taxPrice;
        @JsonProperty("CommissionableTotalPrice")
        public CommissionableTotalPrice commissionableTotalPrice;
        @JsonProperty("CommissionableBasePrice")
        public CommissionableBasePrice commissionableBasePrice;
        @JsonProperty("CommissionablePerPerson")
        public CommissionablePerPerson commissionablePerPerson;
        @JsonProperty("AirlineMaxMarkupInfo")
        public AirlineMaxMarkupInfo airlineMaxMarkupInfo;
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
        @JsonProperty("ChangeFeeBefore")
        public ChangeFeeBefore changeFeeBefore;
        @JsonProperty("ChangeFeeAfter")
        public ChangeFeeAfter changeFeeAfter;
        @JsonProperty("CancelFeeBefore")
        public CancelFeeBefore cancelFeeBefore;
        @JsonProperty("CancelFeeAfter")
        public CancelFeeAfter cancelFeeAfter;
        @JsonProperty("0_FlightStops")
        public int _0_FlightStops;
        @JsonProperty("0_FlightDuration")
        public int _0_FlightDuration;
        @JsonProperty("0_FlightDeparture")
        public Date _0_FlightDeparture;
        @JsonProperty("0_MarketingAirline")
        public int _0_MarketingAirline;
        @JsonProperty("1_FlightStops")
        public int _1_FlightStops;
        @JsonProperty("1_FlightDuration")
        public int _1_FlightDuration;
        @JsonProperty("1_FlightDeparture")
        public Date _1_FlightDeparture;
        @JsonProperty("1_MarketingAirline")
        public int _1_MarketingAirline;
        @JsonProperty("OfferItem")
        public ArrayList<OfferItem> offerItem;
        @JsonProperty("AirlineCharge")
        public ArrayList<AirlineCharge> airlineCharge;
        @JsonProperty("SplitPaymentInfo")
        public ArrayList<SplitPaymentInfo> splitPaymentInfo;
        @JsonProperty("SupplierWiseFares")
        public ArrayList<SupplierWiseFare> supplierWiseFares;
        @JsonProperty("RuleLoyaltyCode")
        public ArrayList<String> ruleLoyaltyCode;
        @JsonProperty("BookingToEquivExRate")
        public double bookingToEquivExRate;
        @JsonProperty("ApiCurrency")
        public String apiCurrency;
        @JsonProperty("ApiCurrencyExRate")
        public int apiCurrencyExRate;
        @JsonProperty("ReqCurrency")
        public String reqCurrency;
        @JsonProperty("ReqCurrencyExRate")
        public double reqCurrencyExRate;
        @JsonProperty("PosCurrency")
        public String posCurrency;
        @JsonProperty("PosCurrencyExRate")
        public int posCurrencyExRate;
        @JsonProperty("SupplierId")
        public int supplierId;
        @JsonProperty("FopRef")
        public String fopRef;
    }

    public class OfferItem{
        @JsonProperty("OfferItemID")
        public String offerItemID;
        @JsonProperty("Refundable")
        public String refundable;
        @JsonProperty("PassengerType")
        public String passengerType;
        @JsonProperty("PassengerQuantity")
        public int passengerQuantity;
        @JsonProperty("TotalPriceDetail")
        public TotalPriceDetail totalPriceDetail;
        @JsonProperty("Service")
        public ArrayList<Service> service;
        @JsonProperty("FareDetail")
        public FareDetail fareDetail;
        @JsonProperty("FareComponent")
        public ArrayList<FareComponent> fareComponent;
    }

    public class OffersGroup{
        @JsonProperty("AirlineOffers")
        public ArrayList<AirlineOffer> airlineOffers;
    }

    public class OperatingCarrier{
        @JsonProperty("AirlineID")
        public String airlineID;
        @JsonProperty("Name")
        public String name;
        @JsonProperty("FlightNumber")
        public String flightNumber;
        @JsonProperty("OrgAirlineID")
        public String orgAirlineID;
    }

    public class OriginDestination{
        @JsonProperty("OriginDestinationKey")
        public String originDestinationKey;
        @JsonProperty("DepartureCode")
        public String departureCode;
        @JsonProperty("ArrivalCode")
        public String arrivalCode;
        @JsonProperty("FlightReferences")
        public String flightReferences;
    }

    public class OriginDestinationList{
        @JsonProperty("OriginDestination")
        public ArrayList<OriginDestination> originDestination;
    }

    public class Party{
        @JsonProperty("Sender")
        public Sender sender;
    }

    public class Passenger{
        @JsonProperty("PassengerID")
        public String passengerID;
        @JsonProperty("PTC")
        public String pTC;
    }

    public class PassengerList{
        @JsonProperty("Passengers")
        public ArrayList<Passenger> passengers;
    }

    public class PaxFareBreakup{
        @JsonProperty("PaxType")
        public String paxType;
        @JsonProperty("PaxQuantity")
        public int paxQuantity;
        @JsonProperty("PosBaseFare")
        public int posBaseFare;
        @JsonProperty("PosTaxFare")
        public double posTaxFare;
        @JsonProperty("PosYQTax")
        public double posYQTax;
        @JsonProperty("PosYRTax")
        public int posYRTax;
        @JsonProperty("PosTotalFare")
        public double posTotalFare;
        @JsonProperty("ItinTax")
        public ArrayList<ItinTax> itinTax;
        @JsonProperty("SupplierMarkup")
        public int supplierMarkup;
        @JsonProperty("SupplierDiscount")
        public int supplierDiscount;
        @JsonProperty("SupplierSurcharge")
        public int supplierSurcharge;
        @JsonProperty("SupplierAgencyCommission")
        public int supplierAgencyCommission;
        @JsonProperty("SupplierAgencyYqCommission")
        public int supplierAgencyYqCommission;
        @JsonProperty("SupplierSegmentBenifit")
        public int supplierSegmentBenifit;
        @JsonProperty("AddOnCharge")
        public int addOnCharge;
        @JsonProperty("PortalMarkup")
        public int portalMarkup;
        @JsonProperty("PortalDiscount")
        public int portalDiscount;
        @JsonProperty("PortalSurcharge")
        public int portalSurcharge;
        @JsonProperty("SupplierHstAmount")
        public int supplierHstAmount;
        @JsonProperty("AddOnHstAmount")
        public int addOnHstAmount;
        @JsonProperty("PortalHstAmount")
        public int portalHstAmount;
        @JsonProperty("SupplierUpSaleAmt")
        public int supplierUpSaleAmt;
        @JsonProperty("AirlineCommission")
        public int airlineCommission;
        @JsonProperty("AirlineYqCommission")
        public int airlineYqCommission;
        @JsonProperty("AirlineSegmentBenifit")
        public int airlineSegmentBenifit;
        @JsonProperty("AirlineCommissionPercentage")
        public int airlineCommissionPercentage;
        @JsonProperty("AirlineCommissionFixed")
        public int airlineCommissionFixed;
        @JsonProperty("SupplierAgencyCommissionPercentage")
        public int supplierAgencyCommissionPercentage;
        @JsonProperty("AirlineYqCommissionPercentage")
        public int airlineYqCommissionPercentage;
        @JsonProperty("SupplierAgencyYqCommissionPercentage")
        public int supplierAgencyYqCommissionPercentage;
        @JsonProperty("AirlineDiscountPercentage")
        public int airlineDiscountPercentage;
        @JsonProperty("SupplierAgencyDiscountPercentage")
        public int supplierAgencyDiscountPercentage;
        @JsonProperty("AirlineYqDiscountPercentage")
        public int airlineYqDiscountPercentage;
        @JsonProperty("SupplierAgencyYqDiscountPercentage")
        public int supplierAgencyYqDiscountPercentage;
        @JsonProperty("SupplierMarkupPercentage")
        public int supplierMarkupPercentage;
        @JsonProperty("SupplierDiscountPercentage")
        public int supplierDiscountPercentage;
        @JsonProperty("PosApiTotalFare")
        public double posApiTotalFare;
        @JsonProperty("PosApiBaseFare")
        public int posApiBaseFare;
        @JsonProperty("PosApiTaxFare")
        public double posApiTaxFare;
        @JsonProperty("PosCurrency")
        public String posCurrency;
        @JsonProperty("SupplierBookingFee")
        public int supplierBookingFee;
        @JsonProperty("PortalBookingFee")
        public int portalBookingFee;
        @JsonProperty("AirlineSegmentCommission")
        public int airlineSegmentCommission;
        @JsonProperty("RuleType")
        public String ruleType;
    }

    public class PerPerson{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
    }

    public class PerPersonRounded{
        @JsonProperty("BookingCurrencyPrice")
        public int bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public int equivCurrencyPrice;
    }

    public class PG{
        @JsonProperty("Allowed")
        public String allowed;
        @JsonProperty("Types")
        public Types types;
    }

    public class PointValues{
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

    public class PriceClass{
        @JsonProperty("PriceClassID")
        public String priceClassID;
        @JsonProperty("Name")
        public String name;
        @JsonProperty("ClassOfService")
        public ArrayList<ClassOfService> classOfService;
    }

    public class PriceClassList{
        @JsonProperty("PriceClass")
        public ArrayList<PriceClass> priceClass;
    }

    public class PriceMetadatas{
        @JsonProperty("MediaInfo")
        public ArrayList<Object> mediaInfo;
    }

    public class RewardSettings{
        @JsonProperty("RewardAvailable")
        public String rewardAvailable;
        @JsonProperty("PointTypes")
        public ArrayList<Object> pointTypes;
        @JsonProperty("PointValues")
        public PointValues pointValues;
    }

    public class Root{
        @JsonProperty("AirShoppingRS")
        public AirShoppingRS airShoppingRS;
    }

    public class Sender{
        @JsonProperty("TravelAgencySender")
        public TravelAgencySender travelAgencySender;
    }

    public class Service{
        @JsonProperty("ServiceID")
        public String serviceID;
        @JsonProperty("PassengerRefs")
        public String passengerRefs;
        @JsonProperty("FlightRefs")
        public String flightRefs;
    }

    public class SplitPaymentInfo{
        @JsonProperty("AirItineraryId")
        public String airItineraryId;
        @JsonProperty("MultipleFop")
        public String multipleFop;
        @JsonProperty("MaxCardsPerPax")
        public int maxCardsPerPax;
        @JsonProperty("MaxCardsPerPaxInMFOP")
        public int maxCardsPerPaxInMFOP;
        @JsonProperty("AllowedMarkup")
        public AllowedMarkup allowedMarkup;
    }

    public class Stops{
        @JsonProperty("Value")
        public int value;
    }

    public class Success{
    }

    public class SupplierWiseFare{
        @JsonProperty("SupplierAccountId")
        public int supplierAccountId;
        @JsonProperty("ConsumerAccountid")
        public int consumerAccountid;
        @JsonProperty("SupplierMarkup")
        public int supplierMarkup;
        @JsonProperty("SupplierDiscount")
        public int supplierDiscount;
        @JsonProperty("SupplierSurcharge")
        public int supplierSurcharge;
        @JsonProperty("PosContractName")
        public String posContractName;
        @JsonProperty("PosTemplateName")
        public String posTemplateName;
        @JsonProperty("PosRuleName")
        public String posRuleName;
        @JsonProperty("PosRuleCode")
        public String posRuleCode;
        @JsonProperty("SupplierMarkupTemplateName")
        public String supplierMarkupTemplateName;
        @JsonProperty("SupplierMarkupContractName")
        public String supplierMarkupContractName;
        @JsonProperty("SupplierMarkupRuleName")
        public String supplierMarkupRuleName;
        @JsonProperty("SupplierMarkupRuleCode")
        public String supplierMarkupRuleCode;
        @JsonProperty("SupplierMarkupRef")
        public String supplierMarkupRef;
        @JsonProperty("AddOnCharge")
        public int addOnCharge;
        @JsonProperty("PortalMarkup")
        public int portalMarkup;
        @JsonProperty("PortalDiscount")
        public int portalDiscount;
        @JsonProperty("PortalSurcharge")
        public int portalSurcharge;
        @JsonProperty("PortalMarkupTemplateId")
        public int portalMarkupTemplateId;
        @JsonProperty("PortalMarkupTemplateName")
        public String portalMarkupTemplateName;
        @JsonProperty("PortalMarkupContractName")
        public String portalMarkupContractName;
        @JsonProperty("PortalMarkupRuleName")
        public String portalMarkupRuleName;
        @JsonProperty("PortalMarkupRuleCode")
        public String portalMarkupRuleCode;
        @JsonProperty("SupplierHstAmount")
        public int supplierHstAmount;
        @JsonProperty("AddOnHstAmount")
        public int addOnHstAmount;
        @JsonProperty("PortalHstAmount")
        public int portalHstAmount;
        @JsonProperty("SupplierUpSaleAmt")
        public int supplierUpSaleAmt;
        @JsonProperty("AirlineCommission")
        public int airlineCommission;
        @JsonProperty("PaxFareBreakup")
        public ArrayList<PaxFareBreakup> paxFareBreakup;
        @JsonProperty("SupplierBookingFee")
        public int supplierBookingFee;
        @JsonProperty("SupplierAgencyCommission")
        public int supplierAgencyCommission;
        @JsonProperty("AirlineCommissionPercentage")
        public int airlineCommissionPercentage;
        @JsonProperty("SupplierAgencyCommissionPercentage")
        public int supplierAgencyCommissionPercentage;
        @JsonProperty("AirlineYqCommissionPercentage")
        public int airlineYqCommissionPercentage;
        @JsonProperty("SupplierAgencyYqCommissionPercentage")
        public int supplierAgencyYqCommissionPercentage;
        @JsonProperty("AirlineDiscountPercentage")
        public int airlineDiscountPercentage;
        @JsonProperty("SupplierAgencyDiscountPercentage")
        public int supplierAgencyDiscountPercentage;
        @JsonProperty("AirlineYqDiscountPercentage")
        public int airlineYqDiscountPercentage;
        @JsonProperty("SupplierAgencyYqDiscountPercentage")
        public int supplierAgencyYqDiscountPercentage;
        @JsonProperty("SupplierMarkupPercentage")
        public int supplierMarkupPercentage;
        @JsonProperty("SupplierDiscountPercentage")
        public int supplierDiscountPercentage;
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

    public class TaxPrice{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class Terminal{
        @JsonProperty("Name")
        public String name;
    }

    public class TotalAmount{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class TotalPrice{
        @JsonProperty("BookingCurrencyPrice")
        public double bookingCurrencyPrice;
        @JsonProperty("EquivCurrencyPrice")
        public double equivCurrencyPrice;
        @JsonProperty("ApiCurrencyPrice")
        public double apiCurrencyPrice;
    }

    public class TotalPriceDetail{
        @JsonProperty("TotalAmount")
        public TotalAmount totalAmount;
    }

    public class TravelAgencySender{
        @JsonProperty("Name")
        public String name;
        @JsonProperty("IATA_Number")
        public String iATA_Number;
        @JsonProperty("AgencyID")
        public String agencyID;
        @JsonProperty("Contacts")
        public Contacts contacts;
    }

    public class Types{
        @JsonProperty("AX")
        public AX aX;
        @JsonProperty("MC")
        public MC mC;
        @JsonProperty("VI")
        public VI vI;
        @JsonProperty("JC")
        public JC jC;
        @JsonProperty("DC")
        public DC dC;
        @JsonProperty("DUS")
        public DUS dUS;
        @JsonProperty("MA")
        public MA mA;
    }

    public class VI{
        @JsonProperty("F")
        public F f;
        @JsonProperty("P")
        public int p;
    }

}
