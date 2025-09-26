package com.example.hotel;

import com.example.hotel.model.Huesped;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Huesped.class;

        for (Annotation annotation : clazz.getAnnotations()) {
            System.out.println("Anotación encontrada: " + annotation.annotationType().getName());
        }

    }
}
