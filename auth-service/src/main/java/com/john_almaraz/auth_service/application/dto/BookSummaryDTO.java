package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.enums.CategoryBook;
import com.john_almaraz.auth_service.domain.valueObjects.FullName;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class BookSummaryDTO {

    private ID id;
    private String tittle;
    private FullName author;
    private CategoryBook categoryBook;
    private BigDecimal price;

}
