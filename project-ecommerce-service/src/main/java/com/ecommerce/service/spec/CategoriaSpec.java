package com.ecommerce.service.spec;

import com.ecommerce.service.entity.Categoria;
import com.ecommerce.service.entity.filters.CategoriaFilter;
import org.springframework.data.jpa.domain.Specification;

public interface CategoriaSpec {
    Specification<Categoria> filtrar (CategoriaFilter filter);
}