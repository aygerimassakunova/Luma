package com.ProjectLuma.ui.selenium.enums;

import com.ProjectLuma.ui.selenium.models.NewUser;
import lombok.Getter;

public enum CreateAccountEnum {

    userFirstName("Asel"),
    userLastName("Bayel"),

    userPassw("Bo342231"),

    userEmail("agg-@bek.com");

    @Getter
   String credentials;

    CreateAccountEnum(String credentials){
        this.credentials=credentials;
    }

}
