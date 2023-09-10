package com.example.diningwith.core.domain.meetup;

import com.example.diningwith.core.domain.profile.Profile;
import com.example.diningwith.core.domain.profile.ProfileReader;
import com.example.diningwith.core.storage.meetup.MeetUpEntity;
import com.example.diningwith.core.storage.meetup.MeetUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * profile repository 에 의존할지, profile reader 에 의존할지,,
 * 만약 서비스가 두개로 찢어진다면 ?
 * -> reader에 의존하는게 데이터베이스 의존성을 제거할 수 있어보임.
 */
@Component
@RequiredArgsConstructor
public class MeetUpWriter {

    private final MeetUpRepository meetUpRepository;
    private final ProfileReader profileReader;

    public MeetUp write(Long userId, RegisterMeetUpRequest registerMeetUpRequest) {

        MeetUpEntity meetUpEntity = meetUpRepository.save(
                new MeetUpEntity(
                        userId,
                        registerMeetUpRequest.name(),
                        registerMeetUpRequest.description(),
                        registerMeetUpRequest.address()
                )
        );
        Profile profile = profileReader.readByUserId(userId);

        return toMeetUp(
                meetUpEntity,
                profile
        );
    }


    private MeetUp toMeetUp(MeetUpEntity meetUpEntity, Profile profile) {
        return new MeetUp(
                meetUpEntity.getId(),
                new MeetUpHost(
                        profile.getUserId(),
                        profile.getNickname(),
                        profile.getBio()
                ),
                meetUpEntity.getName(),
                meetUpEntity.getDescription(),
                meetUpEntity.getAddress()
        );
    }
}
