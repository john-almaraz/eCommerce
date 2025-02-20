package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.enums.Role;
import com.john_almaraz.auth_service.domain.enums.UserStatus;
import com.john_almaraz.auth_service.domain.valueObjects.Email;
import com.john_almaraz.auth_service.domain.valueObjects.FullName;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import com.john_almaraz.auth_service.domain.valueObjects.Password;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserDTO {

    private ID id;
    private FullName fullName;
    private Email email;
    private Password password;
    private Role role ;
    private UserStatus userStatus;

}
