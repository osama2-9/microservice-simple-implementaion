/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carservice.carservice.service;

import com.carservice.carservice.repo.CarRepo;
import com.carservice.carservice.models.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author osama
 */
@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    
    
    public List<Car> getAllCars(){
    return this.carRepo.findAll();
    }
    
    public Car getCarById(Long carId){
    return this.carRepo.findById(carId).get();
    }
    public Car addCar(Car car){
    return this.carRepo.save(car);
    }
    
    
}
