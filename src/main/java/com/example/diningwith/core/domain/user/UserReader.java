package com.example.diningwith.core.domain.user;

import com.example.diningwith.core.storage.user.UserEntity;
import com.example.diningwith.core.storage.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserReader {
    private final UserRepository userRepository;


    public List<User> readAll() {
        return userRepository.findAll().stream().map(this::toUser).toList();
    }


    private User toUser(UserEntity userEntity) {
        return new User(
                userEntity.getId()
        );
    }
}
