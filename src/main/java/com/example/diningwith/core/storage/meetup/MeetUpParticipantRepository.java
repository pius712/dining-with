package com.example.diningwith.core.storage.meetup;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeetUpParticipantRepository extends JpaRepository<MeetUpParticipantEntity, Long> {

    List<MeetUpParticipantEntity> findByUserId(Long UserId);
}
