package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.valueObjects.CreditCardVO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreditCardDTO {

    private ID id;
    private CreditCardVO creditCardVO;
}
