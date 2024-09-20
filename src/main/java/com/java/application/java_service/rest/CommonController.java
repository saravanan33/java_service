package com.java.application.java_service.rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.application.java_service.RequestBody.EmployeeRequestBody;
import com.java.application.java_service.dao.entity.Employee;
import com.java.application.java_service.dao.entity.TransactionFeeDetails;
import com.java.application.java_service.dao.repository.EmployeeDao;
import com.java.application.java_service.dao.repository.TransactionFeeDao;
import com.java.application.java_service.dto.State;
import com.java.application.java_service.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class CommonController {

    private List<StudentData> studentData;
    private TransactionFeeDao transactionFeeDao;
    private RestTemplate RestClient;


    @PostConstruct
    public void loadData()
    {
        studentData = new ArrayList<>();

        studentData.add(new StudentData("saravanan","viswa","saravananpak1997@gmail.com"));
        studentData.add(new StudentData("vignesh","murugan","vignes@gmail.com"));
        studentData.add(new StudentData("hamanth","kumar","hamanth@gmail.com"));

    }

    @GetMapping("/student")
    public List<StudentData> getStudentData()
    {
        return studentData;
    }

    @GetMapping("/transactionFee/{id}")
    public List<TransactionFeeDetails> getFeeDetails(@PathVariable Integer id, TransactionFeeDao transactionFeeDao)
    {
        System.out.println("tempData  id : "+ id);

        List<TransactionFeeDetails> transactionFeeDetails = transactionFeeDao.findByFeeId(id);

//        return transactionFeeDetails;
        for (TransactionFeeDetails tempData : transactionFeeDetails) {
            System.out.println(tempData);
        }
        return  null;
    }

    @GetMapping("student/{id}")
    public StudentData getStudentData(@PathVariable Integer id)
    {

        System.out.println("student id :" + id);
        System.out.println("student size :" + studentData.size());


        if(id <=0 || id >= studentData.size()){
            throw new StudentNotFoundException("Student Not Found with Id:" + id);
        }
        return  studentData.get(id);
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public void saveEmployee(@Valid @RequestBody EmployeeRequestBody employeeRequestBody, EmployeeDao employeeDao) {

        Employee employee = new Employee(
                employeeRequestBody.getUserName(),
                employeeRequestBody.getLastname(),
                employeeRequestBody.getEmailId()
        );

        System.out.println(employee);
        employeeDao.save(employee);
        System.out.println(employeeDao.getClass());
        System.out.println(employee.getEmployeeId());

        return ;

    }

    @RequestMapping(value = "/getState", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getStateJson() throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://d36ygyjvmk0itz.cloudfront.net/qa/en/state.json"))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
//        List<State> state = objectMapper.readValue(response.body(), State.class);

        List<State> states = objectMapper.readValue(response.body(), new TypeReference<List<State>>(){});

        System.out.println(states.size());
        List<String> name = new ArrayList<>();
        List<String> country = new ArrayList<>();
        Map<String, Object> responseData = new HashMap<>();
        List<State> indianStates = new ArrayList<>();

        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).country_code.equals("IN")) {
//                country.add(states.get(i).country_code);
//
//                name.add(states.get(i).getName());

                indianStates.add(states.get(i));
            }
//            System.out.println(states.toString());
        }

        responseData.put("status", "success");
        responseData.put("status_code", HttpStatus.OK);
        responseData.put("data", indianStates);

//        System.out.println(indianStates);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

}
