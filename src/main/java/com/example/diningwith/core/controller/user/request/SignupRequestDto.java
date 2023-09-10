package com.example.diningwith.core.controller.user.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SignupRequestDto {

    @NotNull
    String id;

    @NotNull
    String password;
}
