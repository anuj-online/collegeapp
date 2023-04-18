package com.coding.application.data.service;

import com.coding.application.data.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository
        extends
            JpaRepository<SamplePerson, Long> {

    boolean existsByEmail(String email);
}
