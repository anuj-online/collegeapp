package com.coding.application.data.service;

import com.coding.application.views.newsingup.SingUpRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public SingUpRequest saveUpdate(SingUpRequest samplePerson) {
        return repository.save(samplePerson);
    }
}

