package com.example.diningwith.core.domain.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileRegisterService {

    private final ProfileWriter profileWriter;

    public void register(Long userId, RegisterProfileRequest registerProfileRequest) {
        profileWriter.write(userId, registerProfileRequest);
    }
}
