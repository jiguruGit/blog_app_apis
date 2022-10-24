package com.jiguru.vamshi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiguru.vamshi.entities.DepartmentRegistrationEntity;
import com.jiguru.vamshi.entities.EmployeeRegistrationEntity;
import com.jiguru.vamshi.entities.Users;
import com.jiguru.vamshi.repositories.EmployeeRegistrationRepository;
import com.jiguru.vamshi.repositories.UserRepo;
import com.jiguru.vamshi.utils.ResponseBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/Employee")
public class EmployeeRegistrationController {


}
