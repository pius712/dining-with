package com.example.diningwith.core.controller;

import com.example.boilerplate.core.support.error.GlobalExceptionType;
import com.example.boilerplate.core.support.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalAdvice {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ApiResponse<Void> noHandlerException() {
        return ApiResponse.fail(
                GlobalExceptionType.HANDLER_NOT_FOUND
        );
    }
}
