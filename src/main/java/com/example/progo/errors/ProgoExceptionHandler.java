package com.example.progo.errors;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class ProgoExceptionHandler {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ProgoErrorResponse> handleResponseStatusException(ResponseStatusException exception){
        ProgoErrorResponse body = new ProgoErrorResponse(exception.getStatusCode().value(), exception.getReason());
        return new ResponseEntity<>(body, exception.getStatusCode());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ProgoErrorResponse> handleGenericException(Exception exception){
        ProgoErrorResponse body = new ProgoErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "server internal error: something went wrong");
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}