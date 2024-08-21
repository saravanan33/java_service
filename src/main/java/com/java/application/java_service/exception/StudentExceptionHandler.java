package com.java.application.java_service.exception;

import com.java.application.java_service.errorrResponse.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handelException(StudentNotFoundException exception) {

        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatusCode(HttpStatus.BAD_GATEWAY.value());
        error.setErrorMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handelException(Exception exception) {

        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatusCode(HttpStatus.BAD_GATEWAY.value());
        error.setErrorMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }
}
