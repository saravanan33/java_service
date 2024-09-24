package com.java.application.java_service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.application.java_service.common.TransactionFeeEnum;
import com.java.application.java_service.dao.entity.BookingMaster;
import com.java.application.java_service.dao.entity.FlightItinerary;
import com.java.application.java_service.dao.entity.TransactionFeeDetails;
import com.java.application.java_service.dao.repository.BookingMasterDao;
import com.java.application.java_service.dao.repository.FlightItineraryDao;
import com.java.application.java_service.dao.repository.TransactionFeeDao;
import com.java.application.java_service.dto.FareDetails;
import com.java.application.java_service.dto.State;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@Slf4j

public class JavaServiceApplication {


    public static void main(String[] args) {

        SpringApplication.run(JavaServiceApplication.class, args);

//        log.info("saravana log");
//        List<String> name = new ArrayList<String>();
//
//        name.add("saravanan");
//        name.add("vignesh");
//        name.add("hamantha");
//        name.add(1,"ram");
//        name.remove("saravanan");
//        System.out.println(name.get(2));


    }

    public static final Integer BookingMasterId = 1;
    public static final Integer FeeId = 2;
    public static TransactionFeeEnum VAR = TransactionFeeEnum.CF;
    public static final String feeName = "saravanan";
    public static final Double feeAmount = 10.10;
    public static final String createdAt = "2024-07-15 08:10:17";
    public static final String updatedAt = "2024-07-15 08:10:17";

    private String amount = "20";
    private int ids = 10;
    private int id;
    @Bean
    public CommandLineRunner commandLineRunner(BookingMasterDao bookingMasterDao, FlightItineraryDao flightItineraryDao) {
        return runner -> {
//            createTransactionFee(transactionFeeDao);
//			createMultipleTransaction(transactionFeeDao);
//			selectDataFromTable(transactionFeeDao);
//			selectByFeeId(transactionFeeDao);
//			updateDataByFeeId(transactionFeeDao);
//			deleteFeeDataById(transactionFeeDao);
//          System.out.println("int : "+ids);
//          System.out.println("integer : "+Integer.parseUnsignedInt(amount));
//          System.out.println("start");
//          getBookingMasterData(bookingMasterDao);
//          getFlightItineraryData(flightItineraryDao);
          getBookingMasterIdBasedFlightItinerary(bookingMasterDao);

//          testThisMethod(bookingMasterDao);


        };


    }

    public void testThisMethod(BookingMasterDao bookingMasterDao) {

        bookingMasterDao.getLog();
    }

    private void getBookingMasterIdBasedFlightItinerary(BookingMasterDao bookingMasterDao) throws JsonProcessingException {
        int id = 44274;

        List<FlightItinerary> flightItineraries = bookingMasterDao.findFlightItineraryByBookingMasterId(id);

        System.out.println(flightItineraries);


        ObjectMapper objectMapper = new ObjectMapper();
//        List<State> state = objectMapper.readValue(response.body(), State.class);
        List<FareDetails> fareDetails = new ArrayList<FareDetails>();

        for (FlightItinerary flightItinerary : flightItineraries) {
            fareDetails.add( objectMapper.readValue(flightItinerary.getFareDetails(), new TypeReference<>() {})) ;
//            Map<Object, Object> fareObj = new HashMap<Object, Object>();
//            System.out.println(fareDetails.totalFareDetails.currencyCode);
//            tempFare.add(fareDetails);
        }

        for (int i = 0; i < fareDetails.size(); i++) {
            System.out.println(fareDetails.get(i).totalFareDetails.getTotalFare());

        }


    }

//    private void getFlightItineraryData(FlightItineraryDao flightItineraryDao) {
//
//        FlightItinerary flightItinerary = flightItineraryDao.findById(12);
//
//        System.out.println(flightItinerary.getPnr());
//        System.out.println(flightItinerary.getPnr());
//    }

    private void getBookingMasterData(BookingMasterDao bookingMasterDao) throws JsonProcessingException {
        BookingMaster bookingMaster = bookingMasterDao.findById(44274);
        System.out.println("bookingMaster : " + bookingMaster);
        System.out.println("flightItinery : " + bookingMaster.getFlightItinerary());

        for(int i=0; i<bookingMaster.getFlightItinerary().size(); i++){

            String json = bookingMaster
                    .getFlightItinerary()
                    .get(i)
                    .getFareDetails();


            System.out.println(
                    );
        }
    }

//    private void deleteFeeDataById(TransactionFeeDao transactionFeeDao) {
//
////		TransactionFeeDetails transactionFeeDetails = transactionFeeDao.findById(3);
////
////		System.out.println("selected Data : "+ transactionFeeDetails);
////
////		transactionFeeDao.deleteById(transactionFeeDetails);
//
//        transactionFeeDao.deleteById(3);
//
//    }

//    private void updateDataByFeeId(TransactionFeeDao transactionFeeDao) {
//
//        TransactionFeeDetails transactionFeeDetails = transactionFeeDao.findById(1);
//
//        System.out.println("selected Data: " + transactionFeeDetails);
//        transactionFeeDetails.setFeeName("test Update");
//
//        transactionFeeDao.updateById(transactionFeeDetails);
//
//        System.out.println("updated data: " + transactionFeeDetails);
//
//    }

//    private void selectByFeeId(TransactionFeeDao transactionFeeDao) {
//
//        List<TransactionFeeDetails> theTransactionFeeDetails = transactionFeeDao.findByFeeId(1);
//
//        for (TransactionFeeDetails tempData : theTransactionFeeDetails) {
//            System.out.println(tempData);
//        }
//    }


//    private void selectDataFromTable(TransactionFeeDao transactionFeeDao) {
//
//        List<TransactionFeeDetails> theTransactionFee = transactionFeeDao.findAll();
//
//        for (TransactionFeeDetails temFee : theTransactionFee) {
//            System.out.println(temFee);
//        }
//    }

//    private static void getTransactionFeeData(Integer id) {
//
//    }

//    private void createTransactionFee(TransactionFeeDao transactionFeeDao) {
//
//        System.out.println(VAR);
//        System.out.println("start saving .....");
//        TransactionFeeDetails transactionFeeDetails = new TransactionFeeDetails(JavaServiceApplication.BookingMasterId,
//                JavaServiceApplication.FeeId,
//                JavaServiceApplication.VAR,
//                JavaServiceApplication.feeName,
//                JavaServiceApplication.feeAmount,
//                JavaServiceApplication.createdAt,
//                JavaServiceApplication.updatedAt
//        );
//        transactionFeeDao.save(transactionFeeDetails);
//
//        System.out.println("saved ....." + transactionFeeDetails.getTransactionFeeId());
//
//        this.id = transactionFeeDetails.getTransactionFeeId();
//
//        TransactionFeeDetails transaction = transactionFeeDao.findById(this.id);
//
//        System.out.println(transactionFeeDao.findById(this.id));
//
//    }


//	private void createMultipleTransaction(TransactionFeeDao transactionFeeDao) {
//		TransactionFeeDetails transactionFeeDetails1 = new TransactionFeeDetails(1,
//				2,
//				"CF",
//				10.10,
//				"2-1-2025",
//				"10-10-2025"
//		);
//		transactionFeeDao.save(transactionFeeDetails1);
//		TransactionFeeDetails transactionFeeDetails2 = new TransactionFeeDetails(1,
//				2,
//				"CF",
//				10.10,
//				"2-1-2025",
//				"10-10-2025"
//		);
//		transactionFeeDao.save(transactionFeeDetails2);
//		TransactionFeeDetails transactionFeeDetails3 = new TransactionFeeDetails(1,
//				2,
//				"CF",
//				10.10,
//				"2-1-2025",
//				"10-10-2025"
//		);
//		transactionFeeDao.save(transactionFeeDetails3);
//	}


    @RestController
    public class FunController {

        @Value("${developer.name}")
        private String developerName;

        @Value("${developer.profession}")
        private String developerProfession;

        // expose "/" that return Hello World
        @GetMapping("/")
        public String sayHello() {
            return developerProfession;
        }

        @GetMapping("/hi")
        public String sayFive() {
            return "My Name is saravanan";
        }

        @GetMapping("/developerName")
        public String developerName() {
            return "Developer Name is " + developerName;
        }
    }
}
