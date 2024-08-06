package com.example.login_auth_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("Sucesso!");
    }    
}
