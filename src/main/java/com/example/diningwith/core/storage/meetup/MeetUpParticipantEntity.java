package com.example.diningwith.core.storage.meetup;

import com.example.diningwith.core.storage.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "meet_up_participant")
public class MeetUpParticipantEntity extends BaseEntity {

    @Column(name = "ref_user_id")
    private Long userId;

    @Column(name = "ref_meet_up_id")
    private Long meetUpId;
}
