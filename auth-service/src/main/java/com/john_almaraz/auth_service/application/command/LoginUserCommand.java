package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.domain.valueObjects.Email;
import com.john_almaraz.auth_service.domain.valueObjects.Password;
import lombok.Getter;

@Getter
public class LoginUserCommand {
    private Email email;
    private Password password;
}
