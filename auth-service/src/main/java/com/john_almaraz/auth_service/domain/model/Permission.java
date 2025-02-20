package com.john_almaraz.auth_service.domain.model;

import com.john_almaraz.auth_service.domain.enums.PermissionEnum;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Permission {
    private ID id;
    private PermissionEnum permissionEnum;
    private LocalDateTime datePermissionAdded;
}
