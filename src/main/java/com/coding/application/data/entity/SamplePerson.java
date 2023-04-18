package com.coding.application.data.entity;

import com.vaadin.flow.component.textfield.PasswordField;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Entity
@Data

public class SamplePerson extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    private String phone;
    private LocalDate dateOfBirth;
    private String occupation;
    private String role;
    private boolean important;

}
