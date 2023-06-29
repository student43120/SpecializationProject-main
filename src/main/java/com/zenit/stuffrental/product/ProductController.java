package com.zenit.stuffrental.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @PostMapping
    public void registerNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(
            @PathVariable("productId") Long productId) {
    productService.deleteProduct(productId);
    }

    @PutMapping(path = "{productId}")
    public void updateProduct(
            @PathVariable("productId") Long productId,
            @RequestParam(required = false) String offerName,
            @RequestParam(required = false) OfferType offerType,
            @RequestParam(required = false) LocalDate rentStart,
            @RequestParam(required = false) LocalDate rentEnd,
            @RequestParam(required = false) Double price,
            @RequestParam(required = false) Boolean availability,
            @RequestParam(required = false) Long days) {
        productService.updateProduct(productId, offerName, offerType, rentStart, rentEnd, price, availability, days);
    }
}
