package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.DocumentDTO;
import com.john_almaraz.auth_service.domain.model.Document;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DocumentMapper {

    Document toEntity(DocumentDTO documentDTO);
    DocumentDTO toDTO(Document document);
    List<Document> toListEntity(List<DocumentDTO> documentDTOS);
    List<DocumentDTO> toListDTO(List<Document> documents);

}
