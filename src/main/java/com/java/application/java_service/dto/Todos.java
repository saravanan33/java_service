package com.java.application.java_service.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Todos {


    private int userId;
    private int id;
    private String title;
    private boolean completed;
}
