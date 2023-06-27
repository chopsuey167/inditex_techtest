package com.inditex.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
  public ResponseEntity<String> handleProductNotFoundException() {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
  }

  @org.springframework.web.bind.annotation.ExceptionHandler(InternalServerErrorException.class)
  public ResponseEntity<String> handleInternalServerErrorException() {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
  }
}
