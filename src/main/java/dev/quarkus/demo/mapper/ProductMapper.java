package dev.quarkus.demo.mapper;

import dev.quarkus.demo.entity.ProductEntity;
import dev.quarkus.demo.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface ProductMapper {


    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDto(ProductEntity entity);

    ProductEntity toEntity(ProductDto dto);
}
