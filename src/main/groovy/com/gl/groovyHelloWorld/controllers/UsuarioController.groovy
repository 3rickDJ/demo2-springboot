package com.gl.groovyHelloWorld.controllers

import com.gl.groovyHelloWorld.models.Usuario
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuarioController {
    @RequestMapping(value = "usuarios/{id}")
    public Usuario getUsuarioId( @PathVariable long id){
        Usuario usuario = new Usuario()
        usuario.id = id
        usuario.nombre = "Erick"
        usuario.apellido = "De Jesus"
        usuario.email = "erick.dejesus1@alumno.buap"
        usuario.telefono = "1238111883"
        return usuario
    }
     @RequestMapping(value = "usuarios")
     public List<Usuario> getUsuarios(){
         List <Usuario> usuarios = new ArrayList<>()
         Usuario usuario = new Usuario()
         usuario.id=1
         usuario.nombre = "Erick"
         usuario.apellido = "De Jesus"
         usuario.email = "erick.dejesus1@alumno.buap"
         usuario.telefono = "1238111883"
         Usuario usuario2 = new Usuario()
         usuario2.id=2
         usuario2.nombre = "Karla"
         usuario2.apellido = "Salazar DIas"
         usuario2.email = "karlapeckas@alumno.buap"
         usuario2.telefono = "8121291891"
         Usuario usuario3 = new Usuario()
         usuario3.id=3
         usuario3.nombre = "Juan"
         usuario3.apellido = "Dolores"
         usuario3.email = "Juan.DOlores@alumno.buap"
         usuario3.telefono = "12901"
         usuarios.add(usuario)
         usuarios.add(usuario2)
         usuarios.add(usuario3)
         return usuarios
     }
    // @RequestMapping(value = "prueba")
    // public Usuario getUsuario(){
    //     Usuario usuario = new Usuario()
    //     usuario.nombre = "Erick"
    //     usuario.apellido = "De Jesus"
    //     usuario.email = "erick.dejesus1@alumno.buap"
    //     usuario.telefono = "1238111883"
    //     return usuario
    // }
    // @RequestMapping(value = "prueba")
    // public Usuario getUsuario(){
    //     Usuario usuario = new Usuario()
    //     usuario.nombre = "Erick"
    //     usuario.apellido = "De Jesus"
    //     usuario.email = "erick.dejesus1@alumno.buap"
    //     usuario.telefono = "1238111883"
    //     return usuario
    // }
}
