package com.java.application.java_service.errorrResponse;

public class StudentErrorResponse {

    private Integer statusCode;
    private String ErrorMessage;
    private Long timeStamp;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public StudentErrorResponse() {
    }

    public StudentErrorResponse(Integer statusCode, String errorMessage, Long timeStamp) {
        this.statusCode = statusCode;
        ErrorMessage = errorMessage;
        this.timeStamp = timeStamp;
    }

}
