package com.example.productorderservice;

import org.junit.jupiter.api.Test;

public class ProductServiceTest {

    @Test
    void 상품등록(){
        final AddProductRequest request = new AddProductRequest("상품명",1000, DiscountPolicy.NONE);
        productService.addProduct(request);
    }
}
