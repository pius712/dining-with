package com.example.diningwith.core.domain.meeting.club;

import com.example.diningwith.core.storage.meeting.club.ClubEntity;
import com.example.diningwith.core.storage.meeting.club.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClubWriter {


    private final ClubRepository clubRepository;

    public write(Long userId, CreateClubRequest createClubRequest) {
        clubRepository.save(
                new ClubEntity(
                        clubRepository
                )
        )

    }
}
