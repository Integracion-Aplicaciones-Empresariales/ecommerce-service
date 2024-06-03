package com.ecommerce.service.service;

import com.ecommerce.service.entity.Usuario;
import com.ecommerce.service.repository.UsuarioRepository;
import com.ecommerce.service.utility.GenericResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.ecommerce.service.utility.Global.*;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public GenericResponse<Usuario> login(String email, String password){
//        Optional<Usuario> opt = this.usuarioRepository.login(email, password);
        Optional<Usuario> opt = this.usuarioRepository.login(email, password);
        System.out.println(opt);
        return opt.map(usuario -> new GenericResponse<>(TIPO_AUTH, RPTA_OK, "Inicio de sesión correcto", usuario)).orElseGet(() -> new GenericResponse<>(TIPO_AUTH, RPTA_WARNING, "Usuario no existente", new Usuario()));
    }




}
