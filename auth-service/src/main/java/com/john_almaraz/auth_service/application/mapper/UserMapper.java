package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.UserDTO;
import com.john_almaraz.auth_service.domain.aggregates.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "purchaseHistory", ignore = true)
    @Mapping(target = "shoppingCartID", ignore = true)
    @Mapping(target = "creditCardList", ignore = true)
    @Mapping(target = "catalog", ignore = true)
    @Mapping(target = "documents", ignore = true)
    @Mapping(target = "permissions", ignore = true)
    User toEntity(UserDTO userDTO);
    UserDTO toDTO(User user);
    List<User> toListEntity(List<UserDTO> userDTOS);
    List<UserDTO> toListDTO(List<User> users);

}
