package com.example.diningwith.core.domain.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileWriter profileWriter;
    private final ProfileReader profileReader;

    public Profile makeProfile(Long userId, CreateProfileRequest createProfileRequest) {
        return profileWriter.write(userId, createProfileRequest);
    }

    public Profile readProfile(Long userId) {
        return profileReader.readByUserId(userId);
    }
}
