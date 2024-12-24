package com.belli_babs.basic_app.controller;


import com.belli_babs.basic_app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    private final UserService userService;

    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(){
        log.info("index");
       try{

           return userService.test();
       }catch (Exception e){
          log.debug(e.getMessage());
           return "error";
       }
    }
}
