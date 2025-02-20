package com.john_almaraz.auth_service.domain.valueObjects;

import com.john_almaraz.auth_service.domain.enums.DocumentType;
import com.john_almaraz.auth_service.domain.exceptions.InvalidDocumentFormatException;

public record DocumentVO(DocumentType documentType, String identifier) {

    public DocumentVO {
        if (documentType == null || identifier == null || identifier.isBlank()) {
            throw new InvalidDocumentFormatException("The document must have a document type and identifier");
        }
    }
}
