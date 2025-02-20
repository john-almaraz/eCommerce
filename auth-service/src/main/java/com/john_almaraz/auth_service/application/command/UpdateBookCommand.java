package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.BookSummaryDTO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;

public class UpdateBookCommand {
    private ID sellerId;
    private ID bookId;
    private BookSummaryDTO bookSummaryDTO;
}
