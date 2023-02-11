package com.example.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@RequestMapping("/web")
public class WebController {
    @GetMapping("/get")
    String get(){
        return "12312";
    }
}
