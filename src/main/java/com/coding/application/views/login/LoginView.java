package com.coding.application.views.login;

import com.coding.application.data.service.LoginService;
import com.coding.application.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;


@PageTitle("Login Form")
@Route(value = "login", layout = MainLayout.class)
@Uses(Icon.class)
@Slf4j
public class LoginView extends Div {
    public LoginView(LoginService loginService) {

        LoginForm loginForm = new LoginForm();
        
        add(loginForm);
        loginForm.addLoginListener(loginEvent -> {
            var login = loginService.login(loginEvent.getUsername(), loginEvent.getPassword());
            if(login) Notification.show("Login  success");
            else Notification.show("Invalid creds");
            log.info("username: {} and password: {}", loginEvent.getUsername(), loginEvent.getPassword());
        });


    }
}
