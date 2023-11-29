package com.zenit.stuffrental.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Long> {
    //@Query("SELECT c FROM Customer c WHERE c.email = ?1")
    Optional<Product> findProductById(Long productId);

    Optional<Product> findProductByOfferName(String offerName);
}
