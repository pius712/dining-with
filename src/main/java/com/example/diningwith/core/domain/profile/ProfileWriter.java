package com.example.diningwith.core.domain.profile;

import com.example.diningwith.core.storage.profile.ProfileEntity;
import com.example.diningwith.core.storage.profile.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileWriter {

    private final ProfileRepository profileRepository;

    public Profile write(Long userId, CreateProfileRequest createProfileRequest) {
        ProfileEntity entity = profileRepository.save(
                new ProfileEntity(
                        userId,
                        createProfileRequest.nickname(),
                        createProfileRequest.bio()
                )
        );
        return toProfile(entity);
    }


    private Profile toProfile(ProfileEntity profileEntity) {
        return new Profile(profileEntity.getNickname(), profileEntity.getBio())
    }
}
