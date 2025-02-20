package com.john_almaraz.auth_service.domain.valueObjects;


import com.john_almaraz.auth_service.domain.exceptions.InvalidEmailFormatException;

import java.util.regex.Pattern;

public record Email (String email){

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public Email {
        if(email == null || email.isBlank()){
            throw new InvalidEmailFormatException("Email cannot be null or empty");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    private boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

}
