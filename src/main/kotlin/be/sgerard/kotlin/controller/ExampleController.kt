package be.sgerard.kotlin.controller;

import be.sgerard.kotlin.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
class ExampleController(private val personRepository: PersonRepository) {

    @GetMapping
    fun sayHello(): String {
        val count = personRepository.count()
        return "Hello $count"
    }
}
