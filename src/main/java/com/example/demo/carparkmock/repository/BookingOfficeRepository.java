package com.example.demo.carparkmock.repository;

import com.example.demo.carparkmock.enity.BookingOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingOfficeRepository extends JpaRepository<BookingOffice,Long> {
}
