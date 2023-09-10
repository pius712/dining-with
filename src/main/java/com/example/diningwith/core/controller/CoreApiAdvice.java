package com.example.diningwith.core.controller;

import com.example.diningwith.core.support.error.GlobalExceptionType;
import com.example.diningwith.core.support.error.TypeException;
import com.example.diningwith.core.support.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = {CoreApiAdvice.class})
@Slf4j
public class CoreApiAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ApiResponse<Void> validationException(Exception e) {
        log.info("validation error occurred {}", e.getMessage(), e);
        return ApiResponse.fail(GlobalExceptionType.BAD_REQUEST);
    }

    @ExceptionHandler(TypeException.class)
    ResponseEntity<ApiResponse<Void>> typeException(TypeException e) {

        return new ResponseEntity<>(
                ApiResponse.fail(e.exceptionType),
                e.exceptionType.getHttpStatus()
        );
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    ApiResponse<Void> unknownException(Exception e) {
        log.error("unknown error occurred {}", e.getMessage(), e);
        return ApiResponse.fail(
                GlobalExceptionType.UNHANDLED_ERROR
        );
    }
}
