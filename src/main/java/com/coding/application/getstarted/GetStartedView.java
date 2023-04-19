package com.coding.application.getstarted;

import com.coding.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;

@PageTitle("Get Started")
@Route(value = "")
@Slf4j
public class GetStartedView extends VerticalLayout {

    public GetStartedView() {
        var content = "Welcome to the app";
        var label = new Label(content);
        var getStartedButton = new Button("Get Started");
        setAlignItems(Alignment.CENTER);
        getStartedButton.addClickListener(buttonClickEvent -> {
            getStartedButton.getUI().ifPresent(ui -> ui.navigate("login"));
        });
        add(content);
        add(getStartedButton);
    }
}
