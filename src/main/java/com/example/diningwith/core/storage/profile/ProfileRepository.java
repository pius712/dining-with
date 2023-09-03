package com.example.diningwith.core.storage.profile;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    ProfileEntity findByUserId(Long userId);

    List<ProfileEntity> findByUserIdIn(List<Long> userIds);
}
