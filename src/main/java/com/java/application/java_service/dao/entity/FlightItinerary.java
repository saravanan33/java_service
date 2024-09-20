package com.java.application.java_service.dao.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Getter
@Setter
@Entity
@Table(name="flight_itinerary")
public class FlightItinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_itinerary_id")
    private int flightItineraryId;

    @Column(name="booking_master_id", insertable = false, updatable = false)
    private int bookingMasterId;

    @Column(name="content_source_id")
    private int contentSourceId;

    @Column(name="itinerary_id")
    private String itinerarIid;

    @Column(name="fare_type")
    private String fareType;

    @Column(name="last_ticketing_date")
    private String lastTicketingDate;

    @Column(name="pnr")
    private String pnr;

    @Column(name="lfs_pnr")
    private String lfsPnr;

    @Column(name="parent_pnr")
    private String parentPnr;

    @Column(name="gds_pnr")
    private String gdsPnr;

    @Column(name="gds")
    private String gds;

    @Column(name="pcc")
    private String pcc;

//    @JsonSubTypes.Type(FareDetails.class)
    @Column(name="fare_details", columnDefinition = "TEXT")
    private String fareDetails;

    @Column(name="ssr_details")
    private String ssrDetails;

    @Column(name="fop_details")
    private String fopDetails;

    @Column(name="is_refundable")
    private String isRefundable;

    @Column(name="booking_type")
    private String bookingType;

    @Column(name="booking_status")
    private String bookingStatus;

    @Column(name="base_fare")
    private Double baseFare;

    @Column(name="total_fare")
    private Double totalFare;

    @Column(name="created_at")
    private String createdAt;

    @Column(name="updated_at")
    private String updatedAt;

    @ManyToOne()
    @JoinColumn(name="booking_master_id")
    private BookingMaster bookingMaster;

    @Override
    public String toString() {
        return "FlightItinerary{" +
                "flightItineraryId=" + flightItineraryId +
                ", bookingMasterId=" + bookingMasterId +
                ", contentSourceId=" + contentSourceId +
                ", itinerarIid=" + itinerarIid +
                ", fareType=" + fareType +
                ", lastTicketingDate=" + lastTicketingDate +
                ", pnr=" + pnr +
                ", lfsPnr=" + lfsPnr +
                ", parentPnr=" + parentPnr +
                ", gdsPnr=" + gdsPnr +
                ", gds=" + gds +
                ", pcc=" + pcc +
                ", fareDetails=" + fareDetails +
                ", ssrDetails=" + ssrDetails +
                ", fopDetails=" + fopDetails +
                ", isRefundable=" + isRefundable +
                ", bookingType=" + bookingType +
                ", bookingStatus=" + bookingStatus +
                ", baseFare=" + baseFare +
                ", totalFare=" + totalFare +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
