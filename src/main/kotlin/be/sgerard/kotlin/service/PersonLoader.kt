package be.sgerard.kotlin.service

import be.sgerard.kotlin.model.PersonEntity
import be.sgerard.kotlin.repository.PersonRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class PersonLoader(private val personRepository: PersonRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val persons = listOf(
            PersonEntity(firstName = "John", lastName = "Doe", email = "john.doe@example.com"),
            PersonEntity(firstName = "Jane", lastName = "Doe", email = "jane.doe@example.com"),
            PersonEntity(firstName = "Alice", lastName = "Smith", email = "alice.smith@example.com"),
            PersonEntity(firstName = "Bob", lastName = "Johnson", email = "bob.johnson@example.com")
        )

        personRepository.saveAll(persons)
        println("Persons have been generated and saved.")
    }
}