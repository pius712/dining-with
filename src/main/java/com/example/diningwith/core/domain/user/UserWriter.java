package com.example.diningwith.core.domain.user;

import com.example.diningwith.core.storage.user.UserEntity;
import com.example.diningwith.core.storage.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserWriter {

    private final UserRepository userRepository;

    public User write(CreateUserRequest createUserRequest) {
        UserEntity userEntity = userRepository.save(
                new UserEntity(
                        createUserRequest.id(),
                        createUserRequest.password()
                )
        );
        return toUser(userEntity);
    }

    private User toUser(UserEntity userEntity) {
        return new User(
                userEntity.getId()
        );
    }
}
