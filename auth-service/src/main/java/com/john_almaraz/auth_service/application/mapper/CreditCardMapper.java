package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.CreditCardDTO;
import com.john_almaraz.auth_service.domain.model.CreditCard;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CreditCardMapper {

    CreditCard toEntity(CreditCardDTO creditCardDTO);
    CreditCardDTO toDTO(CreditCard creditCard);
    List<CreditCard> toListEntity(List<CreditCardDTO> creditCardDTOS);
    List<CreditCardDTO> toListDTO(List<CreditCard> creditCardList);

}
