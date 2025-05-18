package com.example.progo.errors;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

/**
 * Global exception handler for the Progo application.
 * Catches and converts exceptions into HTTP responses.
 */
@ControllerAdvice
public class ProgoExceptionHandler {  
  /**
  * an advice that is called after an ResponseStatusExceptions was thrown.
  * it return an http response instead.
  *
  * @param exception the cached exception
  *
  * @return  the http response object wrapping the error data
  */
  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<ProgoErrorResponse> handleResponseStatusException(
      final ResponseStatusException exception
  ) {
    final ProgoErrorResponse body = new ProgoErrorResponse(
        exception.getStatusCode().value(), exception.getReason()
    );
    return new ResponseEntity<>(body, exception.getStatusCode());
  }

  /**
  * an advice that is called after an any exception was thrown.
  * it return an http response instead with 500 INTERNAL_SERVER_ERROR.
  *
  * @param exception the cached exception.
  *
  * @return  the http response object wrapping the error data
  */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<ProgoErrorResponse> handleGenericException(final Exception exception) {
    final ProgoErrorResponse body = new ProgoErrorResponse(
        HttpStatus.INTERNAL_SERVER_ERROR.value(), "server internal error: something went wrong"
    );
    return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
