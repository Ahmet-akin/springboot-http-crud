package com.ravindra.springboothttpcrud.service;

import com.ravindra.springboothttpcrud.data.ProductData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<ProductData> products = new ArrayList<>();

    public List<ProductData> getProducts() {
        return products;
    }

    public void addProduct(ProductData pro) {
    products.add(pro);
    }
}
