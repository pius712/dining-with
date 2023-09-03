package com.example.diningwith.core.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserWriter userWriter;

    public Long signup(CreateUserRequest createUserRequest) {

        return userWriter.write(createUserRequest);
    }
}
