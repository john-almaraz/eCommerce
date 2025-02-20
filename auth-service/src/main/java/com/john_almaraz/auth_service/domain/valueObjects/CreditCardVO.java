package com.john_almaraz.auth_service.domain.valueObjects;

import com.john_almaraz.auth_service.domain.exceptions.InvalidCreditCardFormatException;

import java.util.regex.Pattern;

public record CreditCardVO(String cardNumber, String cardHolder, String expirationDate, String cvvNumber){
    private static final Pattern CARD_NUMBER_PATTERN =
            Pattern.compile("^\\d{16}$");
    private static final Pattern CARD_HOLDER_PATTERN =
            Pattern.compile("^[A-Za-z]{5,30}$");
    private static final Pattern EXPIRATION_DATE_PATTERN =
            Pattern.compile("^\\d{4}$");
    private static final Pattern CVV_NUMBER_PATTERN =
            Pattern.compile("^\\d{3}$");

    public CreditCardVO {
        if (cardNumber == null || cardHolder == null || expirationDate == null || cvvNumber == null) {
            throw new InvalidCreditCardFormatException("Card data cannot be null");
        }
        if(isValidFormat(cardNumber,CARD_NUMBER_PATTERN)){
            throw new InvalidCreditCardFormatException("Invalid card number");
        }
        if(isValidFormat(cardHolder,CARD_HOLDER_PATTERN)){
            throw new InvalidCreditCardFormatException("Invalid card holder");
        }
        if(isValidFormat(expirationDate,EXPIRATION_DATE_PATTERN)){
            throw new InvalidCreditCardFormatException("Invalid expiration date");
        }
        if(isValidFormat(cvvNumber,CVV_NUMBER_PATTERN)){
            throw new InvalidCreditCardFormatException("Invalid card number");
        }
    }

    private boolean isValidFormat(String txt,Pattern format) {
        return txt != null && format.matcher(txt).matches();
    }

}
