package com.example.diningwith.core.support.error;

import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

public interface ExceptionType {
    HttpStatus getHttpStatus();

    ErrorCode getErrorCode();

    String getErrorMessage();

    LogLevel getLogLevel();
}
