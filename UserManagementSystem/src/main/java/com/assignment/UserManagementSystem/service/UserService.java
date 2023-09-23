package com.assignment.UserManagementSystem.service;

import com.assignment.UserManagementSystem.model.User;
import com.assignment.UserManagementSystem.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo user;

    public String addNewUser(List<User> newUser) {
        user.saveAll(newUser);
        return newUser.size() + " new users are added successfully.";
    }

    public List <User> getUserById(List<Integer> ids) {

        return (List<User>) user.findAllById(ids);
    }

    public List<User> getAllUsers() {
        return (List<User>) user.findAll();
    }


    public String updateUserById(Integer id, User myuser) {
        User presentUser = user.findById(id).orElse(null);
        if(presentUser != null){
            presentUser.setUserName(myuser.getUserName());
            presentUser.setUserEmail(myuser.getUserEmail());
            presentUser.setUserPhoneNumber(myuser.getUserPhoneNumber());
            presentUser.setDateOfBirth(myuser.getDateOfBirth());
            user.save(presentUser);
            return "User with id: "+ id + " is updated successfully.";
        }
        return "User with id: " + id + " is not found.";
    }

    public String deleteUseByID(Integer id) {
        User presentUser = user.findById(id).orElse(null);
        if(presentUser != null){
            user.deleteById(id);
            return "User with id: "+ id + " is deleted successfully.";
        }
        return "User with id: " + id + " is not found.";
    }

    public String deleteAllUsers() {
        user.deleteAll();
        return "All users deleted successfully";
    }

    public String deleteUsersByIDs(List<Integer> ids) {
        user.deleteAllById(ids);
        return  ids.size() + " users are deleted successfully";
    }
}
