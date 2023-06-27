package com.inditex.app.controller;

import com.inditex.app.ProductApi;
import com.inditex.app.mapper.ProductDTOMapper;
import com.inditex.app.model.product.ProductDetailDTO;
import com.inditex.app.models.ProductDetail;
import com.inditex.app.service.ProductService;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController implements ProductApi {

  private final ProductService productService;
  private final ProductDTOMapper mapper;

  @Override
  public ResponseEntity<Set<ProductDetailDTO>> getProductSimilar(String productId) throws Exception {

    List<ProductDetail> similarProducts = productService.getSimilarProducts(productId);

    return ResponseEntity.ok(mapper.toProductDetailDTOSet(similarProducts));
  }
}
