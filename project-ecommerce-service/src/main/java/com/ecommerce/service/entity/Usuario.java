package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 16)
    private String clave;

    @Column
    private boolean vigencia;

    @OneToOne
    private Cliente cliente;

}
