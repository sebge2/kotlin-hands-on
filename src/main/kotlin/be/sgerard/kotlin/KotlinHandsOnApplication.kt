package be.sgerard.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinHandsOnApplication

fun main(args: Array<String>) {
	runApplication<KotlinHandsOnApplication>(*args)
}
