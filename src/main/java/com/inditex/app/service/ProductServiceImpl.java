package com.inditex.app.service;

import com.inditex.app.clients.MockFeignClient;
import com.inditex.app.exception.InternalServerErrorException;
import com.inditex.app.exception.ProductNotFoundException;
import com.inditex.app.models.ProductDetail;
import feign.FeignException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final MockFeignClient mockFeignClient;

  @Override
  public List<ProductDetail> getSimilarProducts(String productId) throws Exception {
    try {
      List<String> similarIds = mockFeignClient.getProductSimilarIds(productId);

      return similarIds.stream().map(mockFeignClient::getProductDetail)
          .collect(Collectors.toList());
    } catch (FeignException.NotFound e) {
      throw new ProductNotFoundException(e);
    } catch (FeignException.InternalServerError e) {
      throw new InternalServerErrorException(e);
    }
  }
}
