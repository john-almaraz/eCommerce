package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.BookSummaryDTO;
import com.john_almaraz.auth_service.domain.model.BookSummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookSummaryMapper {

    BookSummary toEntity(BookSummaryDTO bookSummaryDTO);
    BookSummaryDTO toDTO(BookSummary bookSummary);
    List<BookSummary> toListEntity(List<BookSummaryDTO> bookSummaryDTOS);
    List<BookSummaryDTO> toListDTO(List<BookSummary> bookSummaries);

}
