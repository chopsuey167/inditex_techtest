package com.inditex.app.exception;

public class ProductNotFoundException extends Exception {

  public ProductNotFoundException(Throwable cause) {
    super("Product Not found", cause);
  }
}
