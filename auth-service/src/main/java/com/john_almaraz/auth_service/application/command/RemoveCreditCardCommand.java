package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class RemoveCreditCardCommand {
    private ID clientId;
    private ID paymentMethodId;
}
