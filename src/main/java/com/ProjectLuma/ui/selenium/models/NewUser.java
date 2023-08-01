package com.ProjectLuma.ui.selenium.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class NewUser {
    private String userName;
    private String userLastName;
    private String userEmail;
    private String userPassword;

}
