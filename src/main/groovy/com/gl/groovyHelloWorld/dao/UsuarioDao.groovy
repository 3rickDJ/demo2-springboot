package com.gl.groovyHelloWorld.dao

import com.gl.groovyHelloWorld.models.Usuario

interface UsuarioDao {
    List<Usuario> getUsuarios()
}