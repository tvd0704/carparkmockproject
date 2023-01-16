package com.example.demo.carparkmock.repository;

import com.example.demo.carparkmock.enity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,String> {
}
