/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reservationservice.reservation.Repo;

import com.reservationservice.reservation.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author osama
 */
@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
    
}
