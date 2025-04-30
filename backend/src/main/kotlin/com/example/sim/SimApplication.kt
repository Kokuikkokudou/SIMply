package com.example.sim

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimApplication

fun main(args: Array<String>) {
    runApplication<SimApplication>(*args)
}
