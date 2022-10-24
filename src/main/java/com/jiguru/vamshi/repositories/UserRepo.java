package com.jiguru.vamshi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiguru.vamshi.entities.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
