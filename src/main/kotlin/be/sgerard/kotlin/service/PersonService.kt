package be.sgerard.kotlin.service

import be.sgerard.kotlin.model.PersonEntity
import java.util.*

interface PersonService {

    /**
     * Retrieves all persons.
     */
    fun findAll(): List<PersonEntity>

    /**
     * Retrieves a person by his ID.
     */
    fun findById(id: Long): Optional<PersonEntity>

    /**
     * Creates a new person.
     */
    fun create(person: PersonEntity): PersonEntity

    /**
     * Updates the information of an existing person.
     */
    fun update(person: PersonEntity): PersonEntity

    /**
     * Deletes a person by his ID.
     */
    fun delete(id: Long): Optional<PersonEntity>

}