package com.java.application.java_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Getter
@Setter
public class FareDetails {


    public TotalFareDetails totalFareDetails;
    public ArrayList<PaxFareDetail> paxFareDetails;

    @Override
    public String toString() {
        return "FareDetails{" +
                "totalFareDetails=" + totalFareDetails +
                ", paxFareDetails=" + paxFareDetails +
                '}';
    }
}


