package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.CreditCardDTO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class AddCreditCardCommand {
    private ID clientId;
    private CreditCardDTO creditCardDTO;
}
