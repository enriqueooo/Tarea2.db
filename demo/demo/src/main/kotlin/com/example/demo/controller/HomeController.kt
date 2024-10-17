package com.example.demo.controller

import com.example.demo.model.Model
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/home" )
class HomeController {

    /*@GetMapping("/{id}")
    fun home(@PathVariable ("id") id: Int ): String {
        return "Hello World! $id"
    }*/

    /*@GetMapping
    fun home(@PathParam("id") id: Int): String{
    return "Hello world + $id"
    }*/


    @GetMapping("/{id}")
    fun home(@RequestBody model: Model): String {
        return "Hola ing Marco, e-s-t-e  e-s  m-i  d-e-b-e-r ! ${model.id} ${model.name} ${model.age}"

    }
}