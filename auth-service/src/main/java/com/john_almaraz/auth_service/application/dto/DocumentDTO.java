package com.john_almaraz.auth_service.application.dto;

import com.john_almaraz.auth_service.domain.valueObjects.DocumentVO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DocumentDTO {

    private ID id;
    private DocumentVO documentVO;

}
