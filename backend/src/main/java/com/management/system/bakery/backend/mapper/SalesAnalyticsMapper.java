package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.SalesAnalyticsDTO;
import com.management.system.bakery.backend.entity.SalesAnalytics;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SalesAnalyticsMapper {

    SalesAnalyticsDTO toDto(SalesAnalytics salesAnalytics);

    SalesAnalytics toEntity(SalesAnalyticsDTO salesAnalyticsDTO);
}
