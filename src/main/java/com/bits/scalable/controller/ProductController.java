package com.bits.scalable.controller;

import com.bits.scalable.domain.Product;
import com.bits.scalable.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save_product")
    public Product saveDepartment(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/get_product")
    public Product findByProductId(@RequestParam("id") Long productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/get_all_products")
    public List<Product> findAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete_product")
    public void deleteByProductId(@RequestParam("id") Long productId) {
        productService.deleteByProductId(productId);
    }

}

