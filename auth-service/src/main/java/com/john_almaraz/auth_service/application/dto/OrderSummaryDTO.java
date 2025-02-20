package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.enums.OrderStatus;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class OrderSummaryDTO {

    private ID id;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private BigDecimal totalAmount;
    private ID creditCardId;

}
