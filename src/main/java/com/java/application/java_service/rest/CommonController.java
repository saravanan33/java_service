package com.java.application.java_service.rest;

import com.java.application.java_service.dao.entity.TransactionFeeDetails;
import com.java.application.java_service.dao.repository.TransactionFeeDao;
import com.java.application.java_service.errorrResponse.StudentErrorResponse;
import com.java.application.java_service.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class CommonController {

    private List<StudentData> studentData;
    private TransactionFeeDao transactionFeeDao;

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



}
