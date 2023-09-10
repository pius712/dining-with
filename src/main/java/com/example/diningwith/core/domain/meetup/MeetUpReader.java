package com.example.diningwith.core.domain.meetup;

import com.example.diningwith.core.domain.profile.Profile;
import com.example.diningwith.core.domain.profile.ProfileReader;
import com.example.diningwith.core.storage.meetup.MeetUpEntity;
import com.example.diningwith.core.storage.meetup.MeetUpParticipantEntity;
import com.example.diningwith.core.storage.meetup.MeetUpParticipantRepository;
import com.example.diningwith.core.storage.meetup.MeetUpRepository;
import com.example.diningwith.core.support.error.CoreException;
import com.example.diningwith.core.support.error.CoreExceptionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MeetUpReader {

    private final MeetUpRepository meetUpRepository;
    private final ProfileReader profileReader;
    private final MeetUpParticipantRepository meetUpParticipantRepository;

    public MeetUp readById(Long id) {
        MeetUpEntity entity = meetUpRepository.findById(id).orElseThrow(() -> new CoreException(CoreExceptionType.NOT_FOUND));

        Profile profile = profileReader.readByUserId(entity.getUserId());

        return toMeetUp(entity, profile);
    }

    /**
     *
     */
    public List<MeetUp> readParticipating(Long userId) {
        List<MeetUpParticipantEntity> meetUpParticipantEntities = meetUpParticipantRepository.findByUserId(userId);

        List<MeetUpEntity> meetUpEntities = meetUpRepository
                .findAllById(meetUpParticipantEntities
                        .stream()
                        .map(MeetUpParticipantEntity::getId)
                        .toList());

        Map<Long, List<MeetUpEntity>> meetUpMap = meetUpEntities
                .stream()
                .collect(Collectors.groupingBy(MeetUpEntity::getUserId));

        List<Profile> profiles = profileReader
                .readAllByUserId(meetUpEntities.stream().map(MeetUpEntity::getUserId).toList());

        return meetUpEntities.stream().map((each) -> toMeetUp(
                each,
                profiles
                        .stream()
                        .filter((eachProfile) -> eachProfile.getUserId().equals(each.getUserId()))
                        .findFirst().orElseThrow(() -> new CoreException(CoreExceptionType.NOT_FOUND))
        )).toList();
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
