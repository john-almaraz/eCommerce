package com.john_almaraz.auth_service.domain.exceptions;

public class InvalidNameFormatException extends RuntimeException {
  public InvalidNameFormatException(String message) {
    super(message);
  }
}
