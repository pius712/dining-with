package com.example.diningwith.core.storage.meeting.club;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubParticipantRepository extends JpaRepository<ClubParticipantEntity, Long> {

    List<ClubParticipantEntity> findByClubId(Long clubId);
}
