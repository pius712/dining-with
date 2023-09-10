package com.example.diningwith.core.controller.meetup.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MeetUpRegisterRequestDto {

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String address;

}
