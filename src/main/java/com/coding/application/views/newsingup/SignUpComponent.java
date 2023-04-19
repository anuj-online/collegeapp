package com.coding.application.views.newsingup;

import com.coding.application.data.service.UserService;
import com.coding.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("New Sign up")
@Route(value = "new-sing-up")
@Uses(Icon.class)
public class SignUpComponent extends VerticalLayout {


    SingUpRequest singUpRequest = new SingUpRequest();
    public SignUpComponent(UserService userService) {

        addClassName("new-sign-up");
        SignUpView signUpView = new SignUpView();
        Button save = new Button("Save");
        save.addClickListener(click -> {
            try {
                signUpView.getBinder().writeBean(singUpRequest);
                userService.saveUpdate(singUpRequest);
                getUI().ifPresent(ui -> ui.navigate("login"));
            } catch (ValidationException e) {
                throw new RuntimeException(e);
            }
        });
        add(signUpView);
        add(save);

    }

}
