package com.coding.application.data.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    SamplePersonRepository repository;

    public boolean login(String username, String password){
        return repository.existsByEmail(username);
    }
}
