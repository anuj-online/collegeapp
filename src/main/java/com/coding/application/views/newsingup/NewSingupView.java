package com.coding.application.views.newsingup;

import com.coding.application.views.MainLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("New Sign up")
@Route(value = "new-sing-up", layout = MainLayout.class)
@Uses(Icon.class)
public class NewSingupView extends Div {


    private View view
            = new View();
    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");
    public NewSingupView() {

        addClassName("new-sign-up");
        add(createTitle());
        add(createFormLayout());
        add(createButtonLayout());
        save.addClickListener(buttonClickEvent -> {
            System.out.println(view.getFirstName().getValue());
        });
    }

    private Component createTitle() {
        return new H3("Personal information");
    }

    private Component createFormLayout() {
        var view1 = new View();
        view1.add(view1.getFirstName());
        return view1;
    }

    private Component createButtonLayout() {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.addClassName("button-layout");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(save);
        buttonLayout.add(cancel);
        return buttonLayout;
    }
}
