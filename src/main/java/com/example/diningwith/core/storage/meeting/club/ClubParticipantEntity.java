package com.example.diningwith.core.storage.meeting.club;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ClubParticipantEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column(name = "ref_club_id")
    Long clubId;

    @Column(name = "ref_user_id")
    Long userId;
}
