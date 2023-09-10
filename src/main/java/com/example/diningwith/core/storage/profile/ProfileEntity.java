package com.example.diningwith.core.storage.profile;

import com.example.diningwith.core.storage.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "profile")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProfileEntity extends BaseEntity {

    @Column(name = "ref_user_id")
    Long userId;

    @Column
    String nickname;

    @Column
    String bio;

//    String snsUrl;

    public ProfileEntity(Long userId, String nickname, String bio) {
        this.userId = userId;
        this.nickname = nickname;
        this.bio = bio;
    }

}
