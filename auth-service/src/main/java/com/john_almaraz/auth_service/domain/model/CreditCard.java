package com.john_almaraz.auth_service.domain.model;

import com.john_almaraz.auth_service.domain.valueObjects.CreditCardVO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

@Data
public class CreditCard {

    private ID id;
    private CreditCardVO creditCardVO;
}
