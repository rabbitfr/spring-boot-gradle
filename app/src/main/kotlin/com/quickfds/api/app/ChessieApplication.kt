package com.quickfds.api.app

import com.quickfds.api.list.MyService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.quickfds.api"])
class ChessieApplication(
    @Autowired
    val service: MyService
) {
}

private val log = LoggerFactory.getLogger(ChessieApplication::class.java)

fun main(args: Array<String>) {
    runApplication<ChessieApplication>(*args)
}
