package com.assignment.UserManagementSystem.controller;

import com.assignment.UserManagementSystem.model.User;
import com.assignment.UserManagementSystem.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService myUser;

    //adding users
    @PostMapping("users")
    public String addUsers(@RequestBody List<User> newUser){
        return myUser.addNewUser(newUser);
    }

    //getting user details
    @GetMapping("user/id/{ids}")
    public List<User> getUserById(@PathVariable List<Integer> ids){
        return  myUser.getUserById(ids);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return myUser.getAllUsers();
    }

    //updating user details
    @PutMapping("user/id/{id}")
    public String updateUserById(@PathVariable Integer id, @RequestBody User user){
        return myUser.updateUserById(id, user);
    }

    //deleting user
    @DeleteMapping("user/id/{id}")
    public String deleteUseByID(@PathVariable Integer id){
        return  myUser.deleteUseByID(id);
    }
    @DeleteMapping("users/ids/{ids}")
    public String deleteUsersByIDs(@PathVariable List<Integer> ids){
        return  myUser.deleteUsersByIDs(ids);
    }

    @DeleteMapping("users")
    public String deleteAllUsers(){
        return  myUser.deleteAllUsers();
    }

}
