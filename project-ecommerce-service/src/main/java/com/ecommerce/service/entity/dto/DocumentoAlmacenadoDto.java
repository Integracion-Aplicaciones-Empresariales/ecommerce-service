package com.ecommerce.service.entity.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class DocumentoAlmacenadoDto {
    private long id;
    private String nombre;
    private String fileName;
    private String extension;
    private String estado;
    private boolean eliminado;
    private MultipartFile file;
    private String urlFile;

    public DocumentoAlmacenadoDto() {
        id = 0;
        nombre = "";
        fileName = "";
        extension = "";
        estado = "A";
        eliminado = false;
    }

}
