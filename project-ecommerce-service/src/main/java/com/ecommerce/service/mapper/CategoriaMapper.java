package com.ecommerce.service.mapper;


import com.ecommerce.service.entity.Categoria;
import com.ecommerce.service.entity.dto.CategoriaDto;
import com.ecommerce.service.mapperImpl.GenericMapperImpl;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends GenericMapperImpl.GenericMapper<CategoriaDto, Categoria> {
    @Override
    CategoriaDto toDto(Categoria categoria);

    @Override
    Categoria toEntity(CategoriaDto categoriaDto);
}

