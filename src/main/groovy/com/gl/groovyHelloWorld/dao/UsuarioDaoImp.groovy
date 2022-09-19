package com.gl.groovyHelloWorld.dao

import com.gl.groovyHelloWorld.models.Usuario
import org.springframework.stereotype.Repository

@Repository
class UsuarioDaoImp implements UsuarioDao {
    @Override
    List<Usuario> getUsuarios() {
        return null
    }
}
