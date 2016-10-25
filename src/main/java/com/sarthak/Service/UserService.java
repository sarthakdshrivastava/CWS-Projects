package com.sarthak.Service;

import com.sarthak.DTO.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sarthak on 25-10-2016.
 */
@RestController
public class UserService {
    @RequestMapping(value = "/authenticate",method = RequestMethod.POST)
    public boolean authenticateUser(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.getName() + " + " + userDTO.getPassword());
        if(userDTO.getName().equals("sarthak") && userDTO.getPassword().equals("abc123"))
            return true;
        else
            return false;
    }
}
