package com.demofing.service;

import com.demofing.aggregates.response.BaseResponse;
import com.demofing.aggregates.resquest.PersonaRequest;

public interface PersonaService {
    BaseResponse crearPersona(PersonaRequest personaRequest);
    BaseResponse getInfoReniec(String numero);
}
