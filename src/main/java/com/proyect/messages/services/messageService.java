package com.proyect.messages.services;


import org.springframework.stereotype.Service;

@Service
public class messageService {

    public String recibirNombre(String nombre){
        return "Hola "+ "\""+ nombre +"\"" + " Bienbenido a nuestro BackEnd";
    }
}
