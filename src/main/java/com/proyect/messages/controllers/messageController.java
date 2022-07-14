package com.proyect.messages.controllers;


import com.proyect.messages.services.messageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class messageController {

    @Autowired
    messageService messageService;

    @GetMapping()
    public String menssage(){

        return "Bienbenido al BackEnd del Licenciado en Ingenieria de Software \"Uziel\" ";
    }

    @GetMapping(path = "/nombre")
    public String bienvenida(@RequestParam String nombre){

        return messageService.recibirNombre(nombre);
    }

}
