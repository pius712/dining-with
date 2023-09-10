package com.example.diningwith.core.storage.meetup;

import com.example.diningwith.core.storage.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * host : meet up = 1: N
 */
@Entity
@Table(name = "meet_up")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MeetUpEntity extends BaseEntity {

    @Column(name = "ref_user_id")
    private Long userId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String address;

    public MeetUpEntity(
            Long userId,
            String name, String description, String address) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.address = address;
    }
}
