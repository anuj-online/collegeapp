package com.coding.application.views.login;

import com.coding.application.data.service.LoginService;
import com.coding.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;


@PageTitle("Login Form")
@Route(value = "login")
@Uses(Icon.class)
@Slf4j
public class LoginView extends VerticalLayout {
    public LoginView(LoginService loginService) {
        add(new Label("username is your email address  :) "));
        LoginForm loginForm = new LoginForm();
        
        add(loginForm);
        loginForm.addLoginListener(loginEvent -> {
            var login = loginService.login(loginEvent.getUsername(), loginEvent.getPassword());


            if(login){
                Notification.show("Successful login", 1000, Notification.Position.TOP_STRETCH).open();
                getUI().ifPresent(ui -> ui.navigate("hello-world"));
            }
            else {
                Notification.show("Invalid credentials", 5000, Notification.Position.TOP_STRETCH).open();
                loginForm.setEnabled(true);
            }

            log.info("username: {} and password: {}", loginEvent.getUsername(), loginEvent.getPassword());
        });
        var label = new Label("new user?");
        var singup = new Button("Sign up");
        setAlignItems(FlexComponent.Alignment.CENTER);
        singup.addClickListener(buttonClickEvent -> {
            singup.getUI().ifPresent(ui -> ui.navigate("new-sing-up"));
        });
        add(label, singup);


    }
}
