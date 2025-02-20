package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.UserDTO;
import lombok.Getter;

@Getter
public class RegisterUserCommand {
    private UserDTO userDTO;
}
