package com.ozgurucar.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @Email(message = "Email is not well formatted")
    @NotEmpty(message = "Email is mandatory")
    @NotEmpty(message = "Email is mandatory")
    private String email;

    @Size(min = 8, message = "Password length must be minimum 8")
    @NotEmpty(message = "Password is mandatory")
    @NotEmpty(message = "Password is mandatory")
    private String password;
}
