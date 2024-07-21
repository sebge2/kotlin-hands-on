package be.sgerard.kotlin.service

import be.sgerard.kotlin.model.PersonEntity
import be.sgerard.kotlin.repository.PersonRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonServiceImpl(private val repository: PersonRepository) : PersonService {

    override fun findAll(): List<PersonEntity> {
        return repository.findAll()
    }

    override fun findById(id: Long): Optional<PersonEntity> {
        return repository.findById(id)
    }

    override fun create(person: PersonEntity): PersonEntity {
        return repository.save(person)
    }

    override fun update(person: PersonEntity): PersonEntity {
        return repository.findById(person.id!!)
            .map { p ->
                p.lastName = person.lastName
                p.firstName = person.firstName
                p.email = person.email
                repository.save(p)
            }
            .orElseThrow { ResourceNotFoundException("There is no person with id $person.id") }
    }

    override fun delete(id: Long): Optional<PersonEntity> {
        return repository.findById(id)
            .map { person ->
                repository.delete(person)
                person
            }
    }
}