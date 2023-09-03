package com.example.diningwith.core.storage.user;

import com.example.diningwith.core.storage.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends BaseEntity {

    @Column
    String userId;
    @Column
    String userPassword;

    public UserEntity(String id, String password) {
        this.userId = id;
        this.userPassword = password;
    }
}
