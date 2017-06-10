package com.arthaszeng.easyapi.service.product;

import com.arthaszeng.easyapi.entity.Product;
import com.arthaszeng.easyapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findCategoryByProductId(Long productId) {
        return productRepository.findProductById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
