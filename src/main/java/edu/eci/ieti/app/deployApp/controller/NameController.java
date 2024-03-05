package edu.eci.ieti.app.deployApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/names")
public class NameController {

    @GetMapping
    public String getName(){

        return "<h1>Juan Sanchez!</h1>";

    }
}