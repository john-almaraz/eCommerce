package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.PermissionDTO;
import com.john_almaraz.auth_service.domain.model.Permission;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toEntity(PermissionDTO permissionDTO);
    PermissionDTO toDTO(Permission permission);
    List<Permission> toListEntity(List<PermissionDTO> permissionDTOS);
    List<PermissionDTO> toListDTO(List<Permission> permissions);

}
