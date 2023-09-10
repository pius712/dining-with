package com.example.diningwith.core.controller.meetup;

import com.example.diningwith.core.controller.meetup.request.MeetUpRegisterRequestDto;
import com.example.diningwith.core.controller.meetup.response.MeetUpRegisterResponseDto;
import com.example.diningwith.core.controller.meetup.response.MeetUpResponseDto;
import com.example.diningwith.core.domain.meetup.MeetUp;
import com.example.diningwith.core.domain.meetup.MeetUpQueryService;
import com.example.diningwith.core.domain.meetup.MeetUpRegisterService;
import com.example.diningwith.core.domain.meetup.RegisterMeetUpRequest;
import com.example.diningwith.core.support.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/meet-up")
@RequiredArgsConstructor
public class MeetUpController {
    private final MeetUpRegisterService meetUpRegisterService;
    private final MeetUpQueryService meetUpQueryService;

    @PostMapping("register")
    public ApiResponse<MeetUpRegisterResponseDto> register(
            @RequestHeader(name = "user-id") Long userId,
            @RequestBody MeetUpRegisterRequestDto registerRequestDto
    ) {

        MeetUp meetUp = meetUpRegisterService.register(userId, new RegisterMeetUpRequest(
                registerRequestDto.getName(),
                registerRequestDto.getDescription(),
                registerRequestDto.getAddress()
        ));

        return ApiResponse.ok(new MeetUpRegisterResponseDto(meetUp));
    }

    @GetMapping("{id}")
    public ApiResponse<MeetUpResponseDto> getMeetUp(
            @PathVariable() Long id
    ) {
        MeetUp meet = meetUpQueryService.getMeetUp(id);
        return ApiResponse.ok(new MeetUpResponseDto(meet));
    }
}
