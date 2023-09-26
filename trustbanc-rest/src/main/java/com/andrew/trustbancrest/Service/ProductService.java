package com.andrew.trustbancrest.Service;




import com.andrew.trustbancrest.entities.Product;
import com.andrew.trustbancrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }

    public Optional<Product> findProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}

