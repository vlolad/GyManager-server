package ru.gymanager.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfoDto {
    private String id;
    private String login;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
}
