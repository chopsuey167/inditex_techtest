package com.inditex.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {

  private String id;
  private String name;
  private Float price;
  private Boolean availability;
}
