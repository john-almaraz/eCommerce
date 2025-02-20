package com.john_almaraz.auth_service.application.mapper;

import com.john_almaraz.auth_service.application.dto.OrderSummaryDTO;
import com.john_almaraz.auth_service.domain.model.OrderSummary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderSummaryMapper {

    OrderSummary toEntity(OrderSummaryDTO orderSummaryDTO);
    OrderSummaryDTO toDTO(OrderSummary orderSummary);
    List<OrderSummary> toListEntity(List<OrderSummaryDTO> orderSummaryDTOS);
    List<OrderSummaryDTO> toListDTO(List<OrderSummary> orderSummaries);

}
