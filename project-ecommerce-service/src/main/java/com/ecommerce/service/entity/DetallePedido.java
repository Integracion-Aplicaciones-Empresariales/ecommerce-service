package com.ecommerce.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 10, nullable = false)
    private int cantidad;
    @Column(length = 10, nullable = false)
    private Double precio;
    @OneToOne
    private Producto producto;
    @OneToOne
    private Pedido pedido;


}
