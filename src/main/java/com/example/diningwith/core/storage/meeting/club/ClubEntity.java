package com.example.diningwith.core.storage.meeting.club;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ClubEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column
    String title;

    @Column
    String description;
    @Column
    String Location;
    @Column
    Long limit;
}
