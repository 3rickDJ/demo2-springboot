package com.gl.groovyHelloWorld.controllers

import com.gl.groovyHelloWorld.models.Usuario
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuarioController {
    @RequestMapping(value = "prueba")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario()
        usuario.nombre = "Erick"
        usuario.apellido = "De Jesus"
        usuario.email = "erick.dejesus1@alumno.buap"
        usuario.telefono = "1238111883"
        return usuario
    }
}
