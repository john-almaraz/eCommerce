package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class AuthResponseDTO {

    private String token;
    private LocalDateTime expiration;
    private ID userId;
}
