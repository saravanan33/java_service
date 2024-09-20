package com.java.application.java_service.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class aspect {

    @Before("execution(public void getLog(")
    public void beforeGetBookingMasterIdBasedFlightItinerary() {
        System.out.println("logging start");
        log.warn("before getBookingMasterIdBasedFlightItinerary() ======> executed");

    }
}
