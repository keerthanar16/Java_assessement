package com.example.userproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

        @Autowired
        public UserRespository userRespository;

        public User addUser(@RequestBody User user) {
        User obj=new User();
        obj.setUserId(user.getUserId());
        obj.setUserName(user.getUserName());
        obj.setUserEmail(user.getUserEmail());
        obj.setAge(user.getAge());
        obj.setGender(user.getGender());
        obj.setNationally(user.getNationally());
        return obj;
        }
}


