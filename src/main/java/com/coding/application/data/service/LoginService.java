package com.coding.application.data.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    UserRepository repository;

    public boolean login(String username, String password){
        return repository.existsByEmailAndPassword(username, password);
    }
}
