package com.java.application.java_service.model;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @NotNull(message = "is Required")
    @Size(min = 2,max = 10, message = "should be in between 2 to 10 characters")
    private String firstName;

    @NotNull(message = "is Required")
    @Size(min = 2,max = 10, message = "should be in between 2 to 10 characters")
    private String lastName;

    private String country;

}
