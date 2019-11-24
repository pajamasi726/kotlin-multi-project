package com.example.api.controller

import com.example.common.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainApiController {

    @Autowired
    lateinit var helloService: HelloService


    @RequestMapping("/hello")
    fun hello() : String{
        return helloService.hello()
    }
}