package com.java.application.java_service.dao.entity;

import com.java.application.java_service.common.TransactionFeeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="transaction_fee_details")
public class TransactionFeeDetails {

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_fee_id")
    private Integer transactionFeeId;

    @Column(name="booking_master_id", nullable = false)
    private Integer bookingMasterId;

    @Column(name="fee_id", nullable = false)
    private Integer feeId;

    @Column(name="fee_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionFeeEnum feeType;

    @Column(name="fee_name", length = 255, nullable = true)
    private String feeName;

    @Column(name="pos_fee_amount", nullable = false)
    private Double posFeeAmount;

    @Column(name="created_at")
    private String createdAt;

    @Column(name="updated_at", nullable = true)
    private String updatedAt;

    public TransactionFeeDetails() {
    }

    public TransactionFeeDetails(Integer bookingMasterId,
                                 Integer feeId,
                                 TransactionFeeEnum feeType,
                                 String feeName,
                                 Double posFeeAmount,
                                 String createdAt,
                                 String updatedAt
                                 ) {
        this.bookingMasterId = bookingMasterId;
        this.feeId = feeId;
        this.feeType = feeType;
        this.feeName = feeName;
        this.posFeeAmount = posFeeAmount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    @Override
    public String toString() {
        return "TransactionFeeDetails {" +
                "transactionFeeId : " + transactionFeeId + '\'' +
                "booking_master_id : " + bookingMasterId + '\'' +
                "fee_id : " + feeId + '\'' +
                "fee_name : " + feeName + '\'' +
                "feeType : " + feeType + '\'' +
                "posFeeAmount : " + posFeeAmount + '\'' +
                "createdAt : " + createdAt + '\'' +
                "updatedAt : " + updatedAt + '\''

                ;
    }
}
