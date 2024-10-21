package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.ReservationRequestDTO;
import com.management.system.bakery.backend.entity.ReservationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationRequestMapper {

    ReservationRequestDTO toDto(ReservationRequest reservationRequest);

    ReservationRequest toEntity(ReservationRequestDTO reservationRequestDTO);
}

