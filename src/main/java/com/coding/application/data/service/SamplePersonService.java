package com.coding.application.data.service;

import com.coding.application.data.entity.SamplePerson;
import java.util.Optional;

import com.coding.application.views.personform.SignUpForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class SamplePersonService {

    private final SamplePersonRepository repository;

    public SamplePersonService(SamplePersonRepository repository) {
        this.repository = repository;
    }

    public Optional<SamplePerson> get(Long id) {
        return repository.findById(id);
    }

    public SamplePerson saveUpdate(SamplePerson samplePerson) {


        return repository.save(samplePerson);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<SamplePerson> list(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public int count() {
        return (int) repository.count();
    }

}
