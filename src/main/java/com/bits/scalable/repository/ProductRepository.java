package com.bits.scalable.repository;

import com.bits.scalable.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductByProductId(Long productId);

}
