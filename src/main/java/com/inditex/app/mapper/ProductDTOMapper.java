package com.inditex.app.mapper;

import com.inditex.app.model.product.ProductDetailDTO;
import com.inditex.app.models.ProductDetail;
import java.util.List;
import java.util.Set;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDTOMapper {

  Set<ProductDetailDTO> toProductDetailDTOSet(List<ProductDetail> productDetailSet);
}
