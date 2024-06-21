package com.ecommerce.service.controller;

import com.ecommerce.service.entity.Cliente;
import com.ecommerce.service.service.ClienteService;
import com.ecommerce.service.utility.GenericResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public GenericResponse<?> save(@Validated @RequestBody Cliente c){
        return this.service.save(c);
    }

    @PutMapping("/{id}")
    public GenericResponse<?> update(@PathVariable int id, @Validated @RequestBody Cliente c){
        c.setId(id);
        return this.service.save(c);
    }

}
