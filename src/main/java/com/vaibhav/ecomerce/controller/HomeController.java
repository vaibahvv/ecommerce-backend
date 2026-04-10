package com.vaibhav.ecomerce.controller;

import com.vaibhav.ecomerce.model.Product;
import com.vaibhav.ecomerce.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private final ProductRepository productRepository;
    
    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from e-commerce backend!";
    }
    
    @GetMapping("/products")
    public List<Product> getProducts() {
        if (productRepository.count() == 0) {
            productRepository.save(new Product("iPhone 15", 999.99, 50));
            productRepository.save(new Product("MacBook Pro", 1999.99, 20));
            productRepository.save(new Product("AirPods", 199.99, 100));
        }
        return productRepository.findAll();
    }
    
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
    
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return ResponseEntity.ok("Product deleted: " + id);
        }
        return ResponseEntity.notFound().build();
    }
    
    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return productRepository.findById(id)
            .map(product -> {
                product.setName(productDetails.getName());
                product.setPrice(productDetails.getPrice());
                product.setStock(productDetails.getStock());
                Product updatedProduct = productRepository.save(product);
                return ResponseEntity.ok(updatedProduct);
            })
            .orElse(ResponseEntity.notFound().build());
    }
}