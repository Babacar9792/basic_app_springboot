package com.belli_babs.basic_app.service;


import com.belli_babs.basic_app.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserMapper userMapper;

    public String test(){
        return "babacar";
    }
}
