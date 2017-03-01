package com.kumar.JavaProject.controller;

import com.kumar.JavaProject.service.UserService;
import com.kumar.JavaProject.com.kumar.JavaProject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kumaraswamyDR on 01/03/17.
 */

@RestController
public class ApplicationController

{

    @Autowired
    private UserService userService;


    //To get ALl registerd users
    @RequestMapping("/registerdUsers")
    public List<User> getALLRegisterdUsers(){

      return userService.getALLUsers();

    }

    //To get user  corresponding to ID
    @RequestMapping(method = RequestMethod.GET,value = "/getUser")
    public User getUser(@PathVariable String id)
    {
        return userService.getUser(id);
    }

    //To add registerd user details
    @RequestMapping(method = RequestMethod.POST,value = "/addUser")
    public String addUser(@RequestBody User user)
    {
        System.out.print(user.getEmailId());
        return userService.addUser(user);
    }

    //To update user data
    @RequestMapping(method = RequestMethod.PUT,value = "/updateUser")
    public String updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    //To delete user
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteUser")
    public String updateUser(@PathVariable String id)
    {
        return userService.deleteUser(id);
    }

}
