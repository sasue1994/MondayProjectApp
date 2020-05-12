package com.shs.app.controller;

import com.shs.app.repository.DayRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DayController {

    @Autowired
    DayRepository repository;

    @GetMapping(value="/day/{name}")
    @ResponseBody
    public String getMethodName(@PathVariable String name) {
        return name;
    }
    
}