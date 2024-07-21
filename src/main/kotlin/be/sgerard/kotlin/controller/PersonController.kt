package be.sgerard.kotlin.controller

import be.sgerard.kotlin.model.PersonEntity
import be.sgerard.kotlin.service.PersonService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/persons")
class PersonController(private val service: PersonService) {

    @GetMapping
    fun findAll(): List<PersonEntity> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<PersonEntity> {
        return service.findById(id)
            .map { person -> ResponseEntity.ok(person) }
            .orElse(ResponseEntity.notFound().build())
    }

    @PostMapping
    fun create(@RequestBody person: PersonEntity): PersonEntity {
        return service.create(person)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody updatedPerson: PersonEntity): PersonEntity {
        return service.update(updatedPerson)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<PersonEntity> {
        return service.delete(id)
            .map { person -> ResponseEntity<PersonEntity>(person, HttpStatus.NO_CONTENT) }
            .orElse(ResponseEntity.ok().build())
    }
}
