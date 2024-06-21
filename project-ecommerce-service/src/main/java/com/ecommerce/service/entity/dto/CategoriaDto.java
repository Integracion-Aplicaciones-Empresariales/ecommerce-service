package com.ecommerce.service.entity.dto;

import lombok.Data;

@Data
public class CategoriaDto {
    private Integer id;
    private String nombre;
    private boolean vigencia;
    private DocumentoAlmacenadoDto foto;
    private String vigenciaString;
}