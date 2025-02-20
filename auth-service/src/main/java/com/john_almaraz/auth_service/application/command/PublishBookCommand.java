package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.BookSummaryDTO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class PublishBookCommand {
    private ID sellerId;
    private BookSummaryDTO bookSummaryDTO;
}
