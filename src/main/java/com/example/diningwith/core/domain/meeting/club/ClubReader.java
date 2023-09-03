package com.example.diningwith.core.domain.meeting.club;

import com.example.diningwith.core.storage.meeting.club.ClubEntity;
import com.example.diningwith.core.storage.meeting.club.ClubParticipantEntity;
import com.example.diningwith.core.storage.meeting.club.ClubParticipantRepository;
import com.example.diningwith.core.storage.meeting.club.ClubRepository;
import com.example.diningwith.core.storage.profile.ProfileEntity;
import com.example.diningwith.core.storage.profile.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClubReader {

    private final ClubRepository clubRepository;
    private final ClubParticipantRepository clubParticipantRepository;
    private final ProfileRepository profileRepository;

    public Club readById(Long id) {
        ClubEntity clubEntity = clubRepository.findById(id).orElseThrow(CoreException::new);

        List<ClubParticipantEntity> participantEntity = clubParticipantRepository.findByClubId(id);
        List<Long> userIds = participantEntity.stream().map(ClubParticipantEntity::getUserId).toList();
        List<ProfileEntity> profileEntities = profileRepository.findByUserIdIn(userIds);

        return toClub(clubEntity, profileEntities);
    }

    private Club toClub(ClubEntity entity,
                        List<ProfileEntity> profileEntities) {
        return new Club(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                profileEntities.stream().map(this::toClubParticipant).toList(),
                entity.getLimit()
        );
    }

    private ClubParticipant toClubParticipant(ProfileEntity profileEntity) {
        return new ClubParticipant(
                profileEntity.getUserId(),
                profileEntity.getNickname(),
                profileEntity.getBio()
        );
    }
}
