package com.inditex.app.service;

import com.inditex.app.clients.MockFeignClient;
import com.inditex.app.models.ProductDetail;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final MockFeignClient mockFeignClient;

  @Override
  public List<ProductDetail> getSimilarProducts(String productId) {
    List<String> similarIds = mockFeignClient.getProductSimilarIds(productId);

    return similarIds.stream().map(mockFeignClient::getProductDetail)
        .collect(Collectors.toList());
  }
}
