package com.java.application.java_service.RequestBody;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRequestBody {

    @NonNull
    @NotEmpty(message = "user name cannot be empty")
    private String userName;

    @NotNull
    @NotEmpty(message = "last name cannot be empty")
    private String lastname;

    @NotNull
    @Email(message = "not a valid email")
    @NotEmpty(message = "email ID cannot be empty")
    private String emailId;

}
