package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {
    @Autowired
    private HuespedRepository huespedRepository;

    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    public Huesped getHuespedById(Long huespedId){
        return huespedRepository.findById(huespedId).orElse(null);
    }

    public Huesped createHuesped(Huesped huesped){
        return  huespedRepository.save(huesped);
    }

    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    public void deleteHuesped(Long huespedId){
        huespedRepository.deleteById(huespedId);
    }
}
