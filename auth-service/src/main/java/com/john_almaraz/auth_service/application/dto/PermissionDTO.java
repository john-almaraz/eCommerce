package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.enums.PermissionEnum;
import com.john_almaraz.auth_service.domain.valueObjects.ID;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class PermissionDTO {

    private ID id;
    private PermissionEnum permissionEnum;
    private LocalDateTime datePermissionAdded;

}
