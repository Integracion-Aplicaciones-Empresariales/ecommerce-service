package com.ecommerce.service.exception;

import com.ecommerce.service.utility.GenericResponse;
import com.ecommerce.service.utility.Global;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericExceptionHandler {
    @ExceptionHandler(Exception.class)
    public GenericResponse<?> genericException(Exception ex) {
        return new GenericResponse("exception", -1, Global.OPERACION_ERRONEA, ex.getMessage());
    }
}
