package com.example.hotel.repository;

import com.example.hotel.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository <Reserva,Long> {
}
