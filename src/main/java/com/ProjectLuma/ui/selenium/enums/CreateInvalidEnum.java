package com.ProjectLuma.ui.selenium.enums;

import lombok.Getter;

public enum CreateInvalidEnum {

        userFirstName("Asel"),
        userLastName("12345"),

        userPassw("123344"),

        userEmail("frfgcom");

        @Getter
        String credentials;

    CreateInvalidEnum (String credentials){
            this.credentials=credentials;
        }
}
