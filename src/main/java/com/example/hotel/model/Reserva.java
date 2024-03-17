package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private String fechaEntrada;
    private String fechaSalida;
    private double valor;
    private String formaPago;
}
