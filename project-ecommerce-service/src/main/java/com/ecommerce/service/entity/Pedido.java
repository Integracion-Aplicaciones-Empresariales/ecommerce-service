package com.ecommerce.service.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Lima")
    @Column(nullable = false)
    private Date fechaCompra;

    @OneToOne
    private Cliente cliente;

    @Column(length = 10)
    private Double monto;

    @Column(nullable = true)
    private boolean anularPedido;


}
