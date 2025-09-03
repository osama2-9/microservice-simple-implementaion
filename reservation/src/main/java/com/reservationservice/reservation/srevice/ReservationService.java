/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationservice.reservation.srevice;

import com.reservationservice.reservation.Repo.ReservationRepo;
import com.reservationservice.reservation.models.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author osama
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;
    
    
    public List<Reservation> getAllReservation(){
    return this.reservationRepo.findAll();
    }
    
   public Reservation getById(Long id){
   return this.reservationRepo.findById(id).get();
   }
   
   public Reservation createReservation(Reservation reservation){
   return this.reservationRepo.save(reservation);
   }
    
}
