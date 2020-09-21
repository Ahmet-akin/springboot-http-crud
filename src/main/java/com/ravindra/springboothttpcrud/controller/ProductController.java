package com.ravindra.springboothttpcrud.controller;

import com.ravindra.springboothttpcrud.data.ProductData;
import com.ravindra.springboothttpcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
   private ProductService productData;

    @GetMapping("/products")
    public List<ProductData> getProducts(){
        return productData.getProducts();
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductData pro){
        productData.addProduct(pro);

    }
}
