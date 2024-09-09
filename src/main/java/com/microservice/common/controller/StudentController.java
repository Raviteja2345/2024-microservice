package com.microservice.common.controller;

import com.microservice.common.utils.NameValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
@Slf4j
public class StudentController {

    @Autowired
    private NameValidator validator;



    @GetMapping(value = "/studentName")
    public String getStudentName(@RequestParam String name){
       return validator.validateName(name);
    }
}
