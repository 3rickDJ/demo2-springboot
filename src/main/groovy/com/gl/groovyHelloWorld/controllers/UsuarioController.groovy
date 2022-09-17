package com.gl.groovyHelloWorld.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuarioController {
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba"
    }
}
