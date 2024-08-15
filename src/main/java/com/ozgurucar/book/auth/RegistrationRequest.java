package com.ozgurucar.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname is mandatory")
    @NotEmpty(message = "Firstname is mandatory")
    private String firstName;

    @NotEmpty(message = "Lastname is mandatory")
    @NotEmpty(message = "Lastname is mandatory")
    private String lastName;

    @Email(message = "Email is not well formatted")
    @NotEmpty(message = "Email is mandatory")
    @NotEmpty(message = "Email is mandatory")
    private String email;

    @Size(min = 8, message = "Password length must be minimum 8")
    @NotEmpty(message = "Password is mandatory")
    @NotEmpty(message = "Password is mandatory")
    private String password;

}
