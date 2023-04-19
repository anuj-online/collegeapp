package com.coding.application.views.newsingup;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class SingUpRequest{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgenerator")
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String password;
    private LocalDate dob;
    private String mobileNumber;

}
