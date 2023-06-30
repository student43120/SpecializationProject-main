package com.zenit.stuffrental.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        Optional<Product> productOptional = productRepository
                .findProductByOfferName(product.getOfferName());
        if(productOptional.isPresent()){
            throw new IllegalStateException("This product name is taken.");
        }
        productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        boolean exist = productRepository.existsById(productId);
        if (!exist) {
            throw new IllegalStateException(
              "Product with id " + productId + " does not exists");
        }
        productRepository.deleteById(productId);
    }

    @Transactional
    public void updateProduct(Long productId,
                              String offerName,
                              OfferType offerType,
                              LocalDate rentStart,
                              LocalDate rentEnd,
                              Double price,
                              Boolean availability,
                              Long days) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException(
                        "Product with id " + productId + " does not exists"));

        if (offerName != null
                && offerName.length() > 5
                && !Objects.equals(product.getOfferName(), offerName)) {
            product.setOfferName(offerName);
        }

        if (offerType != null
                && !Objects.equals(product.getOfferType(), offerType)) {
            product.setOfferType(offerType);
        }

        if (rentStart != null
                && !Objects.equals(product.getRentStart(), rentStart)) {
            Optional<Product> productOptional = productRepository
                    .findProductByOfferName(offerName);
            if (productOptional.isPresent()) {
                throw new IllegalStateException("This name is taken.");
            }
            product.setRentStart(rentStart);
        }

        if (rentStart != null
                && !Objects.equals(product.getRentStart(), rentStart)) {
            Optional<Product> productOptional = productRepository
                    .findProductByOfferName(offerName);
            if (productOptional.isPresent()) {
                throw new IllegalStateException("This name is taken.");
            }
            product.setRentStart(rentStart);
        }

        if (rentStart != null
                && !Objects.equals(product.getRentEnd(), rentEnd)) {
            Optional<Product> productOptional = productRepository
                    .findProductByOfferName(offerName);
            if (productOptional.isPresent()) {
                throw new IllegalStateException("This name is taken.");
            }
            product.setRentStart(rentEnd);
        }

        if (price != null
                && price > 0
                && !Objects.equals(product.getPrice(), price)) {
            product.setPrice(price);
        }

        if (availability != null
                && !Objects.equals(product.getAvailability(), availability)) {
            product.setAvailability(availability);
        }

        if (days != null
                && !Objects.equals(product.getDays(), days)) {
            product.setDays(rentEnd,rentStart);
        }

    }
}
