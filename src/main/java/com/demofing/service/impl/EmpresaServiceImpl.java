package com.demofing.service.impl;

import com.demofing.aggregates.constants.Constants;
import com.demofing.aggregates.response.BaseResponse;
import com.demofing.aggregates.response.EmpresaResponse;
import com.demofing.feignclient.ReniecClients;
import com.demofing.repository.EmpresaRepository;
import com.demofing.service.EmpresaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;
    private final ReniecClients reniecClients;



    @Value("${token.api}")
    private String tokenApi;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository, ReniecClients reniecClients) {
        this.empresaRepository = empresaRepository;
        this.reniecClients = reniecClients;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        EmpresaResponse response = getExecution(numero);
        if (response != null){
            return new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }
        else {
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR, Optional.empty());
        }
    }

    private EmpresaResponse getExecution(String numero){
        String authorization = "Bearer "+tokenApi;
        return reniecClients.getinfoEmpresa(numero,authorization);
    }


}
