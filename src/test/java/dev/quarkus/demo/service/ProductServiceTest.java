package dev.quarkus.demo.service;

import dev.quarkus.demo.entity.ProductEntity;
import dev.quarkus.demo.mapper.ProductMapper;
import dev.quarkus.demo.model.ProductDto;
import dev.quarkus.demo.repository.ProductRepository;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@QuarkusTest
public class ProductServiceTest {

    @Inject
    ProductService productService;

    @Inject
    ProductMapper productMapper;

    @InjectMock
    ProductRepository productRepository;

    @Test
    public void testGetAllProducts() {
        ProductEntity p1 = new ProductEntity();
        p1.id = 1L;
        p1.name = "Product 1";
        p1.price = 10.0;

        ProductEntity p2 = new ProductEntity();
        p2.id = 2L;
        p2.name = "Product 2";
        p2.price = 20.0;

        when(productRepository.listAll()).thenReturn(List.of(p1, p2));

        // Act
        List<ProductDto> result = productService.getAllProducts();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Product 1", result.get(0).name());
        assertEquals("Product 2", result.get(1).name());
    }
}