package dev.quarkus.demo.service;

import dev.quarkus.demo.entity.ProductEntity;
import dev.quarkus.demo.mapper.ProductMapper;
import dev.quarkus.demo.model.ProductDto;
import dev.quarkus.demo.repository.ProductRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository productRepository;

    @Inject
    private ProductMapper productMapper;

    public List<ProductDto> getAllProducts() {
        return productRepository.listAll().stream()
                .map(entity -> productMapper.toDto(entity))
                .toList();
    }

    public ProductDto createProduct(ProductDto p) {
        ProductEntity newEntity = productMapper.toEntity(p);
        newEntity.setId(null);

        productRepository.persist(newEntity);

        return productMapper.toDto(newEntity);
    }

    public boolean deleteProduct(Long id) {
        return productRepository.deleteById(id);
    }
}
