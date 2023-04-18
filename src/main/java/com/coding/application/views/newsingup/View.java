package com.coding.application.views.newsingup;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import lombok.Data;
import lombok.Getter;

@Data
public class View extends FormLayout {
    private TextField firstName = new TextField("first name");
}
