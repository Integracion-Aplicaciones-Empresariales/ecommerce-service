package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false, unique = true)
    private String nombre;

    @Column(length = 10, nullable = false)
    private Double precio;

    @Column(nullable = false, length = 10)
    private int stock;

    @Column(length = 500)
    private String descripcion;

    @Column
    private boolean vigencia;

    @OneToOne
    private Categoria categoria;


    @OneToOne
    private DocumentoAlmacenado foto;


}
