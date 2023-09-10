package com.example.diningwith.core.domain.meetup;

public record RegisterMeetUpRequest(
        String name,
        String description,
        String address
) {
}
