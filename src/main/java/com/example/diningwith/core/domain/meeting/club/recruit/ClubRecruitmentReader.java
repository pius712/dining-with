package com.example.diningwith.core.domain.meeting.club.recruit;

import com.example.diningwith.core.storage.meeting.club.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClubRecruitmentReader {

    private final ClubRepository clubRepository;
}
