package br.com.alura.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class helloWord {

    @GetMapping
    fun helloWord(): String{
        return "Hello World!"
    }
}