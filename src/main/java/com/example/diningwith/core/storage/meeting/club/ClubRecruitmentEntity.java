package com.example.diningwith.core.storage.meeting.club;

import com.example.diningwith.core.common.enumType.ClubJoinType;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ClubRecruitmentEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column(name = "ref_user_id")
    Long userId;

    @Column()
    String title;

    @Enumerated(EnumType.ORDINAL)
    ClubJoinType joinType;

    @Column()
    Integer ageStart;

    @Column()
    Integer ageEnd;
}
