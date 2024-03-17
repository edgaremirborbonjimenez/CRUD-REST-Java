package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.model.Reserva;
import com.example.hotel.repository.HuespedRepository;
import com.example.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }

    public Reserva createReserva(Reserva reserva){
        return  reservaRepository.save(reserva);
    }

    public Reserva updateeserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Long reservaId){
        reservaRepository.deleteById(reservaId);
    }
}
