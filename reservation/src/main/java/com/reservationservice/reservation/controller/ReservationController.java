/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationservice.reservation.controller;

import com.reservationservice.reservation.models.Reservation;
import com.reservationservice.reservation.srevice.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author osama
 */
@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    
    
    @GetMapping("/")
    public ResponseEntity<List<Reservation>> showAllReservations(){
        List<Reservation> reservations = this.reservationService.getAllReservation();
        return new ResponseEntity(reservations ,HttpStatus.OK);
    
    
    }
    
    @GetMapping("/{id}")
    public ResponseEntity getReservationById(@PathVariable long id){
        Reservation reservation =  this.reservationService.getById(id);
        return new ResponseEntity(reservation ,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation){
    Reservation newReservation = this.reservationService.createReservation(reservation);
    return new ResponseEntity<>(newReservation ,HttpStatus.OK);
    
    
    
    }
}
