package com.john_almaraz.auth_service.domain.exceptions;

public class InvalidDocumentFormatException extends RuntimeException {
    public InvalidDocumentFormatException(String message) {
        super(message);
    }
}
