package com.example.hotel.controller;

import com.example.hotel.model.Huesped;
import com.example.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {
    @Autowired
    private HuespedService huespedService;

    @GetMapping
    public List<Huesped> getAllHuespedes(){
        return huespedService.getAllHuespedes();
    }

    @GetMapping("{id}")
    public Huesped getHuespedById(@PathVariable Long id){
    return huespedService.getHuespedById(id);
    }

    @PostMapping
    public Huesped createHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    @PutMapping("update/{id}")
    public Huesped updateHuesped(@RequestBody Huesped huesped,@PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    @DeleteMapping("delete/{id}")
    public void deleteHuesped(@PathVariable Long id){
        huespedService.deleteHuesped(id);
    }


}
