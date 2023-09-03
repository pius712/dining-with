package com.example.diningwith.core.domain.meeting.club.recruit;

import com.example.diningwith.core.domain.meeting.club.ClubHost;

/**
 * 클럽 모집
 * 호스트
 * 참여 방법 - 바로 가입, 승인제
 * 성별 제한 가능
 * 나이 제한
 */
public class ClubRecruitment {

    ClubHost clubHost;
    String title;

    String joinType;
    String gender;
    Integer ageStart;
    Integer ageEnd;
}
