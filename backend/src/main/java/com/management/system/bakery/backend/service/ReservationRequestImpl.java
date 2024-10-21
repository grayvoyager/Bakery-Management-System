package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.DiningTables;
import com.management.system.bakery.backend.entity.ReservationRequest;
import com.management.system.bakery.backend.entity.User;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.DiningTablesRepository;
import com.management.system.bakery.backend.respository.ReservationRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationRequestImpl implements ReservationRequestService{
    ReservationRequestRepository reservationRequestRepository;
    DiningTablesRepository diningTablesRepository;
    @Override
    public List<ReservationRequest> getAllReservationRequest(String userName) {
        return reservationRequestRepository.findAll();
    }

    @Override
    public ReservationRequest findByUsername(String name) {
        return reservationRequestRepository.findByName(name)
                .orElseThrow(()-> new EntityNotFoundException("No reservation request exists!!"));
    }

    public String acceptReservationRequest(String username, int tableCapacity) {
        ReservationRequest reservationRequest = findByUsername(username);
        List<DiningTables> reservedTables = diningTablesRepository.findByStatus("reserved");

        // Count of reserved tables
        int reservedTableCount = reservedTables.size();

        if (tableCapacity > reservedTableCount) {
            // Update the reservation status to 'approved'
            reservationRequest.setStatus("approved");
            reservationRequestRepository.save(reservationRequest);

            return "Reservation request approved for user: " + username;
        } else {
            reservationRequest.setStatus("rejected");
            reservationRequestRepository.save(reservationRequest);

            return "Reservation request rejected due to insufficient table capacity.";
        }
    }
    @Override
    public void deleteReservationRequest(User user, Long id) {
        reservationRequestRepository.findByName(user.getName())
                .orElseThrow(()-> new EntityNotFoundException("The requested user"+user.getName()+"doesn't have any reservations!!"));
        reservationRequestRepository.deleteById(id);
    }
}
