package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 100, nullable = false)
    private String apellido;
    @Column(length = 20, nullable = false)
    private String tipoDoc;
    @Column(length = 11, nullable = false)
    private String numDoc;
    @Column(length = 500, nullable = false)
    private String direccionEnvio;
    @Column(length = 100, nullable = false)
    private String departamento;
    @Column(length = 100, nullable = false)
    private String provincia;
    @Column(length = 100, nullable = false)
    private String distrito;

    @OneToOne
    private DocumentoAlmacenado foto;


}
