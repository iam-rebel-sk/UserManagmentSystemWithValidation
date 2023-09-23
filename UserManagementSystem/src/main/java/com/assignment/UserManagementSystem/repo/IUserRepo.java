package com.assignment.UserManagementSystem.repo;

import com.assignment.UserManagementSystem.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface IUserRepo extends CrudRepository<User, Integer> {
}
