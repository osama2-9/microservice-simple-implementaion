/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.carservice.carservice.controller;
import com.carservice.carservice.service.CarService;
import com.carservice.carservice.models.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 *
 * @author osama
 */
@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;
    
    @GetMapping("/")
    public ResponseEntity<List<Car>> showAllCars(){
        List<Car> cars = this.carService.getAllCars();
        return new ResponseEntity(cars,HttpStatus.OK);
    
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id){
        Car getCar = this.carService.getCarById(id);
        return new ResponseEntity<>(getCar, HttpStatus.OK);
    
    }

    
    
   
    
    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        Car save = this.carService.addCar(car);
        return new ResponseEntity(save, HttpStatus.CREATED);
    
    }
    
    
    
    
}
