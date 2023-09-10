package com.example.diningwith.core.domain.profile;

import com.example.diningwith.core.storage.profile.ProfileEntity;
import com.example.diningwith.core.storage.profile.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileReader {

    private final ProfileRepository profileRepository;

    public Profile readByUserId(Long userId) {
        ProfileEntity profileEntity = profileRepository.findByUserId(userId);

        return toProfile(profileEntity);
    }

    private Profile toProfile(ProfileEntity profileEntity) {
        return new Profile(
                profileEntity.getId(),
                profileEntity.getUserId(),
                profileEntity.getNickname(),
                profileEntity.getBio()
        );
    }
}
