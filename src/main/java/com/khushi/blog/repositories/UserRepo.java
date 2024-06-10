package com.khushi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khushi.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
