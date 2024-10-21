package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.ReservationRequest;
import com.management.system.bakery.backend.entity.User;

import java.util.List;
import java.util.Optional;

public interface ReservationRequestService {
    List<ReservationRequest> getAllReservationRequest(String name);
    ReservationRequest findByUsername(String name);
    String acceptReservationRequest(String name, int tablecapacity);
    void deleteReservationRequest(User user, Long id);

}
