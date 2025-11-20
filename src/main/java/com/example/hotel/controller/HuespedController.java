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

    /**
     * Tipo de funcion: EQ
     * DETs: 8
     * FTR: 1
     * Complejidad : Baja(3)
     * PF: 3
     * @return
     */
    @GetMapping
    public List<Huesped> getAllHuespedes(){
        return huespedService.getAllHuespedes();
    }

    /**
     * Tipo de funcion: EQ
     * DETs: 7
     * FTR: 1
     * Complejidad: Baja(3)
     * PF: 3
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Huesped getHuespedById(@PathVariable Long id){
    return huespedService.getHuespedById(id);
    }

    /**
     * Tipo de Funcion : EI
     * DETs: 7
     * FTR: 1
     * Complejidad: Media(4)
     * PF: 3
     * @param huesped
     * @return
     */
    @PostMapping
    public Huesped createHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    /**
     * Tipo de funcion : EI
     * DETs: 7
     * FTR: 1
     * Complejidad: Media(4)
     * PF: 3
     * @param huesped
     * @param id
     * @return
     */
    @PutMapping("update/{id}")
    public Huesped updateHuesped(@RequestBody Huesped huesped,@PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    /**
     * Tipo de funcion: EI
     * DETs: 1
     * FTR: 1
     * Complejidad: Baja(3)
     * PF: 3
     * @param id
     */
    @DeleteMapping("delete/{id}")
    public void deleteHuesped(@PathVariable Long id){
        huespedService.deleteHuesped(id);
    }


}
