package com.example.demo.carparkmock.repository;

import com.example.demo.carparkmock.enity.Trip;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
