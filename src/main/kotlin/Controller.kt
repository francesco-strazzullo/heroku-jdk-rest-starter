package com.example

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @RequestMapping("/kotlin")
    internal fun index(): String {
        return "Kotlin is not Java"
    }
}