package com.john_almaraz.auth_service.application.command;

import com.john_almaraz.auth_service.application.dto.DocumentDTO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;

@Getter
public class UpdateDocumentCommand {
    private ID sellerId;
    private ID documentId;
    private DocumentDTO documentDTO;
}
