package com.java.application.java_service.dao.entity;


import com.java.application.java_service.common.BookingSourceEnum;
import com.java.application.java_service.common.BookingSourceRefEnum;
import com.java.application.java_service.common.GeneralEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "booking_master")
public class BookingMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_master_id")
    private Integer bookingMasterId;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "portal_id")
    private Integer portalId;

    @Column(name = "search_id")
    private String searchId;

    @Column(name = "engine_req_id")
    private String engineReqId;

    @Column(name = "booking_req_id")
    private String bookingReqId;

    @Column(name = "booking_ref_id")
    private String bookingRefId;

    @Column(name = "booking_res_id")
    private String bookingResId;

    @Column(name = "osticket_id")
    private String osticketId;

    @Column(name = "lfs_engine_req_id")
    private String lfsEngineReqId;

    @Column(name = "b2c_booking_master_id")
    private Integer b2cBookingMasterId;

    @Column(name = "parent_booking_master_id")
    private Integer parentBookingMasterId;

    @Column(name = "ticket_plugin_credential_id")
    private Integer ticketPluginCredentialId;

    @Column(name = "ticket_plugin_cert_id")
    private String ticketPluginCertId;

    @Column(name = "profile_aggregation_id")
    private Integer profileAggregationId;

    @Column(name = "booking_type")
    private Integer bookingType;

    @Column(name = "booking_source")
    @Enumerated(EnumType.STRING)
    private BookingSourceEnum bookingSource;

    @Column(name = "booking_source_ref")
    @Enumerated(EnumType.STRING)
    private BookingSourceRefEnum bookingSourceRef;

    @Column(name = "request_currency")
    private String requestCurrency;

    @Column(name = "api_currency")
    private String apiCurrency;

    @Column(name = "pos_currency")
    private String posCurrency;

    @Column(name = "request_exchange_rate")
    private Double requestExchangeRate;

    @Column(name = "api_exchange_rate")
    private Double apiExchangeRate;

    @Column(name = "pos_exchange_rate")
    private Double posExchangeRate;

    @Column(name = "request_ip")
    private String requestIp;

    @Column(name = "portal_credential_id")
    private Integer portalCredentialId;

    @Column(name = "booking_status")
    private Integer bookingStatus;

    @Column(name = "ticket_status")
    private Integer ticketStatus;

    @Column(name = "payment_status")
    private Integer paymentStatus;

    @Column(name = "payment_details")
    private String paymentDetails;

    @Column(name = "payment_mode")
    private String paymentMode;

    @Column(name = "other_payment_details")
    private String otherPaymentDetails;

    @Column(name = "trip_type")
    private Integer tripType;

    @Column(name = "cabin_class")
    private String cabinClass;

    @Column(name = "pax_split_up")
    private String paxSplitUp;

    @Column(name = "total_pax_count")
    private Integer totalPaxCount;

    @Column(name = "last_ticketing_date")
    private String lastTicketingDate;

    @Column(name = "cancelled_date")
    private String cancelledDate;

    @Column(name = "cancel_remark")
    private String cancelRemark;

    @Column(name = "cancel_by")
    private Integer cancelBy;

    @Column(name = "cancellation_charge")
    private Double cancellationCharge;

    @Column(name = "insurance")
    @Enumerated(EnumType.STRING)
    private GeneralEnum insurance;

    @Enumerated(EnumType.STRING)
    @Column(name = "hotel")
    private GeneralEnum hotel;

    @Column(name = "meta_name")
    private String metaMame;

    @Column(name = "reward_point_detail")
    private String rewardPointDetail;

    @Column(name = "fail_response")
    private String failResponse;

    @Column(name = "retry_booking_count")
    private Integer retryBookingCount;

    @Column(name = "email_count")
    private Integer emailCount;

    @Column(name = "retry_ticket_count")
    private Integer retryTicketCount;

    @Column(name = "retry_cancel_booking_count")
    private Integer retryCancelBookingCount;

    @Column(name = "hotel_retry_cancel_booking_count")
    private Integer hotelRetryCancelBookingCount;

    @Column(name = "hold_booking_email_notify")
    private String holdBookingEmailNotify;

    @Column(name = "retry_payment_count")
    private Integer retryPaymentCount;

    @Column(name = "retry_ticket_cancel_count")
    private Integer retryTicketCancelCount;

    @Column(name = "redis_response_index")
    private Integer redisResponseIndex;

    @Column(name = "mrms_score")
    private String mrmsScore;

    @Column(name = "mrms_risk_color")
    private String mrmsRiskColor;

    @Column(name = "mrms_risk_type")
    private String mrmsRiskType;

    @Column(name = "mrms_txnid")
    private String mrmsTxnid;

    @Column(name = "mrms_ref")
    private String mrmsRef;

    @Column(name = "promo_code")
    private String promoCode;

    @Column(name = "waiver_code")
    private String waiverCode;

    @Column(name = "reschedule_reason")
    private String rescheduleReason;

    @Column(name = "passport_required")
    @Enumerated(EnumType.STRING)
    private GeneralEnum passportRequired;

    @Column(name = "nationality_required")
    @Enumerated(EnumType.STRING)
    private GeneralEnum nationalityRequired;

    @Column(name = "tsa_issuing_country_required")
    @Enumerated(EnumType.STRING)
    private GeneralEnum tsaIssuingCountryRequired;

    @Column(name = "other_details")
    private String otherDetails;

    @Column(name = "on_behalf_agent_id")
    private Integer onBehalfAgentId;

    @Column(name = "locale")
    private String locale;

    @Column(name = "manual_remarks")
    private String manualRemarks;

    @Column(name = "ticketed_by")
    private Integer ticketedBy;

    @Column(name = "credit_debit_new_flow")
    private String creditDebitNewFlow;

    @Column(name = "administration_fee_details")
    private String administrationFeeDetails;

    @Column(name = "cart_id")
    private Integer cartId;

    @Column(name = "payment_charge_type")
    private String paymentChargeType;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @OneToMany(mappedBy = "bookingMaster", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FlightItinerary> flightItinerary;

    @Override
    public String toString() {
        return "BookingMaster{" +
                "bookingMasterId=" + bookingMasterId +
                ", accountId=" + accountId +
                ", portalId=" + portalId +
                ", searchId='" + searchId + '\'' +
                ", engineReqId='" + engineReqId + '\'' +
                ", bookingReqId='" + bookingReqId + '\'' +
                ", bookingRefId='" + bookingRefId + '\'' +
                ", bookingResId='" + bookingResId + '\'' +
                ", osticketId='" + osticketId + '\'' +
                ", lfsEngineReqId='" + lfsEngineReqId + '\'' +
                ", b2cBookingMasterId=" + b2cBookingMasterId +
                ", parentBookingMasterId=" + parentBookingMasterId +
                ", ticketPluginCredentialId=" + ticketPluginCredentialId +
                ", ticketPluginCertId='" + ticketPluginCertId + '\'' +
                ", profileAggregationId=" + profileAggregationId +
                ", bookingType=" + bookingType +
                ", bookingSource=" + bookingSource +
                ", bookingSourceRef=" + bookingSourceRef +
                ", requestCurrency='" + requestCurrency + '\'' +
                ", apiCurrency='" + apiCurrency + '\'' +
                ", posCurrency='" + posCurrency + '\'' +
                ", requestExchangeRate=" + requestExchangeRate +
                ", apiExchangeRate=" + apiExchangeRate +
                ", posExchangeRate=" + posExchangeRate +
                ", requestIp='" + requestIp + '\'' +
                ", portalCredentialId=" + portalCredentialId +
                ", bookingStatus=" + bookingStatus +
                ", ticketStatus=" + ticketStatus +
                ", paymentStatus=" + paymentStatus +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", otherPaymentDetails='" + otherPaymentDetails + '\'' +
                ", tripType=" + tripType +
                ", cabinClass='" + cabinClass + '\'' +
                ", paxSplitUp='" + paxSplitUp + '\'' +
                ", totalPaxCount=" + totalPaxCount +
                ", lastTicketingDate='" + lastTicketingDate + '\'' +
                ", cancelledDate='" + cancelledDate + '\'' +
                ", cancelRemark='" + cancelRemark + '\'' +
                ", cancelBy=" + cancelBy +
                ", cancellationCharge=" + cancellationCharge +
                ", insurance=" + insurance +
                ", hotel=" + hotel +
                ", metaMame='" + metaMame + '\'' +
                ", rewardPointDetail='" + rewardPointDetail + '\'' +
                ", failResponse='" + failResponse + '\'' +
                ", retryBookingCount=" + retryBookingCount +
                ", emailCount=" + emailCount +
                ", retryTicketCount=" + retryTicketCount +
                ", retryCancelBookingCount=" + retryCancelBookingCount +
                ", hotelRetryCancelBookingCount=" + hotelRetryCancelBookingCount +
                ", holdBookingEmailNotify='" + holdBookingEmailNotify + '\'' +
                ", retryPaymentCount=" + retryPaymentCount +
                ", retryTicketCancelCount=" + retryTicketCancelCount +
                ", redisResponseIndex=" + redisResponseIndex +
                ", mrmsScore='" + mrmsScore + '\'' +
                ", mrmsRiskColor='" + mrmsRiskColor + '\'' +
                ", mrmsRiskType='" + mrmsRiskType + '\'' +
                ", mrmsTxnid='" + mrmsTxnid + '\'' +
                ", mrmsRef='" + mrmsRef + '\'' +
                ", promoCode='" + promoCode + '\'' +
                ", waiverCode='" + waiverCode + '\'' +
                ", rescheduleReason='" + rescheduleReason + '\'' +
                ", passportRequired=" + passportRequired +
                ", nationalityRequired=" + nationalityRequired +
                ", tsaIssuingCountryRequired=" + tsaIssuingCountryRequired +
                ", otherDetails='" + otherDetails + '\'' +
                ", onBehalfAgentId=" + onBehalfAgentId +
                ", locale='" + locale + '\'' +
                ", manualRemarks='" + manualRemarks + '\'' +
                ", ticketedBy=" + ticketedBy +
                ", creditDebitNewFlow=" + creditDebitNewFlow +
                ", administrationFeeDetails='" + administrationFeeDetails + '\'' +
                ", cartId=" + cartId +
                ", paymentChargeType='" + paymentChargeType + '\'' +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
