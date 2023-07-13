package com.board.domain.user.controller;

import com.board.domain.user.dto.UserDto;
import com.board.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping("/")
    public String index() {
        return "/index";
    }
    // 회원가입 페이지
    @GetMapping("/signup")
    public String dispSignup() {
        return "/signup";
    }
    // 회원가입처리
    @PostMapping("/signup")
    public String execSignup(UserDto userDto) {
        userService.joinUser(userDto);
        return "login";
    }


}
