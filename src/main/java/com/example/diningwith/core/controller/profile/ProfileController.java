package com.example.diningwith.core.controller.profile;

import com.example.diningwith.core.domain.profile.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/profile")
public class ProfileController {


    @PostMapping()
    public Profile register() {

    }

    @GetMapping()
    public Profile getProfile() {

    }
}
