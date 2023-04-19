package com.coding.application.data.service;

import com.coding.application.views.newsingup.SingUpRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends
            JpaRepository<SingUpRequest, Long> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);


}
