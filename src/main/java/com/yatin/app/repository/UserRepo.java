package com.yatin.app.repository;

import com.yatin.app.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmailIdIgnoreCase(String emailId);
}