package com.demofing.service.impl;

import com.demofing.aggregates.constants.Constants;
import com.demofing.aggregates.response.BaseResponse;
import com.demofing.aggregates.response.ReniecResponse;
import com.demofing.aggregates.resquest.PersonaRequest;
import com.demofing.feignclient.ReniecClients;
import com.demofing.repository.PersonaRepository;
import com.demofing.service.PersonaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    private final ReniecClients reniecClients;

    public PersonaServiceImpl(PersonaRepository personaRepository, ReniecClients reniecClients) {
        this.personaRepository = personaRepository;
        this.reniecClients = reniecClients;
    }

    @Value("${token.api}")
    private String tokenApi;

    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        ReniecResponse response = getExecution(numero);
        if(response != null){
            return new BaseResponse(Constants.CODE_SUCCESS,Constants.MESS_SUCCESS, Optional.of(response));
        }else{
            return new BaseResponse(Constants.CODE_ERROR,Constants.MESS_ERROR, Optional.empty());
        }
    }

    private ReniecResponse getExecution(String numero){
        String authorization = "Bearer "+tokenApi;
        return reniecClients.getinfo(numero,authorization);
    }
}
