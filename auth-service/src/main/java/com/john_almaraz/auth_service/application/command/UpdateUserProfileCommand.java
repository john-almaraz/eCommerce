package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.UserDTO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class UpdateUserProfileCommand {
    private ID userId;
    private UserDTO userDTO;
}
