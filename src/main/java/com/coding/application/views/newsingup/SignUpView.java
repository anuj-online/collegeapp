package com.coding.application.views.newsingup;

import com.coding.application.PhoneNumberField;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SignUpView extends FormLayout {
    Binder<SingUpRequest> binder;
    public SignUpView(){
        binder = new Binder<>();
        var firstName = new TextField("first name");
        binder.bind(firstName, SingUpRequest::getFirstName, SingUpRequest::setFirstName);

        var lastname = new TextField("last name");
        binder.bind(lastname, SingUpRequest::getLastName, SingUpRequest::setLastName);

        var password = new PasswordField("password");
        binder.forField(password).bind(SingUpRequest::getPassword, SingUpRequest::setPassword);

        PhoneNumberField phoneNumberField = new PhoneNumberField("Phone number");
        binder.forField(phoneNumberField).bind(SingUpRequest::getMobileNumber, SingUpRequest::setMobileNumber);

        DatePicker birthday = new DatePicker("Birthday");
        binder.forField(birthday).bind(SingUpRequest::getDob, SingUpRequest::setDob);

        EmailField emailField = new EmailField("Email");
        binder.forField(emailField).bind(SingUpRequest::getEmail, SingUpRequest::setEmail);

        add(firstName, lastname, emailField,password, phoneNumberField, birthday);

    }

    public Binder<SingUpRequest> getBinder(){
        return binder;
    }
}
