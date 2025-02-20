package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class RemovePermissionCommand {
    private ID adminId;
    private ID permissionId;
    private ID adminIdReceiving;
}
