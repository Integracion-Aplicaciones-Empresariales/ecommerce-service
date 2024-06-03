package com.ecommerce.service.repository;

import com.ecommerce.service.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.email = :email AND u.clave = :password ")
    Optional<Usuario> login(@Param("email") String email,@Param("password") String password);


}
