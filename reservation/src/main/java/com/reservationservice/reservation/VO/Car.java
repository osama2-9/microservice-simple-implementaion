/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reservationservice.reservation.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author osama
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private String make;
    private String model;
    private Double dailyRate;
    
    
}
