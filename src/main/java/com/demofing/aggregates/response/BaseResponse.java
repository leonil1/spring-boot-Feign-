package com.demofing.aggregates.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponse {
    public int code;
    private String message;
    private Optional data;
}
