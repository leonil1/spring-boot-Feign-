package com.demofing.controller;

import com.demofing.aggregates.response.BaseResponse;
import com.demofing.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/{numero}")
    public BaseResponse getInfoReniecRuc(@PathVariable String numero){
        return empresaService.getInfoReniec(numero);
    }
}
