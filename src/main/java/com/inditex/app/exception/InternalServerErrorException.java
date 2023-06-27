package com.inditex.app.exception;

public class InternalServerErrorException extends Exception {

  public InternalServerErrorException(Throwable cause) {
    super("Internal server error", cause);
  }
}
