package com.john_almaraz.auth_service.domain.exceptions;

public class InvalidCreditCardFormatException extends RuntimeException {
    public InvalidCreditCardFormatException(String message) {
        super(message);
    }
}
