package com.sparta.myvoyageblogreview.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    @Size(min = 3, max = 10)
    @Pattern(regexp = "^[A-Za-z0-9]*$")
    private String username;

    @NotBlank
    @Size(min = 4, max = 15)
    @Pattern(regexp = "^[A-Za-z0-9~`!@#$%\\\\^&*()-]*$")
    private String password;

    @NotBlank
    private String passwordCheck;
}