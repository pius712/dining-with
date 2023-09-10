package com.example.diningwith.core.domain.meeting.club;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClubService {


    private final ClubWriter clubWriter;
    private final ClubReader clubReader;

//    public List<Club> createClub(Long userId, CreateClubRequest createClubRequest) {
//        clubWriter.w
//    }

    public void createClub(CreateClubRequest createClubRequest) {
//        return new Club();
    }

    public Club getClub(Long clubId) {

        return clubReader.readById(clubId);
    }
}
