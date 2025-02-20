package com.john_almaraz.auth_service.domain.model;

import com.john_almaraz.auth_service.domain.valueObjects.DocumentVO;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

@Data
public class Document {

    private ID id;
    private DocumentVO documentVO;
}
