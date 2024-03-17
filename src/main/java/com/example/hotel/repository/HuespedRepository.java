package com.example.hotel.repository;

import com.example.hotel.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HuespedRepository extends JpaRepository <Huesped,Long> {
}
