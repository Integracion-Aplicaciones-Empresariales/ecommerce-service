package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categoria {

    public static final String C_NOMBRE = "nombre";
    public static final String C_VIGENCIA = "vigencia";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String nombre;

    @Column(nullable = true)
    private boolean vigencia;

    @OneToOne
    private DocumentoAlmacenado foto;

    @Transient
    private String vigenciaString;


    public void setVigenciaString(String vigenciaString) {
        this.vigenciaString = vigenciaString;
    }

}
