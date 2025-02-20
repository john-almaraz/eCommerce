package com.john_almaraz.auth_service.domain.model;

import com.john_almaraz.auth_service.domain.enums.CategoryBook;
import com.john_almaraz.auth_service.domain.valueObjects.FullName;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookSummary {

    private ID id;
    private String tittle;
    private FullName author;
    private CategoryBook categoryBook;
    private BigDecimal price;

}
