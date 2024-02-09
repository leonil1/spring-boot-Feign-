package com.demofing.service;

import com.demofing.aggregates.response.BaseResponse;

public interface EmpresaService {
    BaseResponse getInfoReniec(String numero);
}
