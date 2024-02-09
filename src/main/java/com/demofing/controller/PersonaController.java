package com.demofing.controller;

import com.demofing.aggregates.response.BaseResponse;
import com.demofing.service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/{numero}")
    public BaseResponse getInfoReniec(@PathVariable String numero){
        return personaService.getInfoReniec(numero);
    }
}
