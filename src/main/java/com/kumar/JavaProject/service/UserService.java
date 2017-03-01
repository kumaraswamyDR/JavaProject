package com.kumar.JavaProject.service;

import com.kumar.JavaProject.repository.UserRepository;
import com.kumar.JavaProject.com.kumar.JavaProject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumaraswamyDR on 01/03/17.
 */
@Service
public class UserService
{

    @Autowired
    private UserRepository userRepository;

    public List<User> getALLUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users::add);
        return  users;
    }
    public String addUser(User user){

        userRepository.save(user);
        return "User data sucessfully saved";
    }

    public String updateUser(User user){

        userRepository.save(user);
        return "User data sucessfully updated";
    }

    public String deleteUser(String id) {

        userRepository.delete(id);
        return "User Data deleted";
    }

    public User getUser(String id) {

        return userRepository.findOne(id);
    }
}
