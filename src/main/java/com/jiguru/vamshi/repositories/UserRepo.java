package com.jiguru.vamshi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiguru.vamshi.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
