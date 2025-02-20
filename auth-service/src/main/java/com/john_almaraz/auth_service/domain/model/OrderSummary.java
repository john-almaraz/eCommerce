package com.john_almaraz.auth_service.domain.model;

import com.john_almaraz.auth_service.domain.enums.OrderStatus;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderSummary {

    private ID id;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private BigDecimal totalAmount;
    private ID creditCardId;

}
