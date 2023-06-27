package com.inditex.app.clients;

import com.inditex.app.models.ProductDetail;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "mockClient",
    value = "mockClient",
    url = "${rest-client.mock.url}"
)
public interface MockFeignClient {

  @GetMapping(
      value = "/product/{productId}/similarids",
      consumes = MediaType.APPLICATION_JSON_VALUE
  )
  List<String> getProductSimilarIds(@PathVariable("productId") String productId);


  @GetMapping(
      value = "/product/{productId}",
      consumes = MediaType.APPLICATION_JSON_VALUE
  )
  ProductDetail getProductDetail(@PathVariable("productId") String productId);
}
