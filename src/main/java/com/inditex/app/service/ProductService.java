package com.inditex.app.service;

import com.inditex.app.models.ProductDetail;
import java.util.List;

public interface ProductService {

  List<ProductDetail> getSimilarProducts(String productId);
}
