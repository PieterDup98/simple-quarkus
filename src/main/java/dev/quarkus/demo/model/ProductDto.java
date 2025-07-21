package dev.quarkus.demo.model;

public record ProductDto(Long id, String name, String category, Double price) {
}
