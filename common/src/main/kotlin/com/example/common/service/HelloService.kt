package com.example.common.service

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun hello() : String{
        return "hello common"
    }
}