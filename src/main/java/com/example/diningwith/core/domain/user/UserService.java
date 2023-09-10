package com.example.diningwith.core.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserWriter userWriter;
    private final UserReader userReader;

    public User signup(CreateUserRequest createUserRequest) {

        return userWriter.write(createUserRequest);
    }

    public List<User> getList() {
        return this.userReader.readAll();
    }
}
