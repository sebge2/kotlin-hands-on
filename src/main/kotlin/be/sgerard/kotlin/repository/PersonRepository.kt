package be.sgerard.kotlin.repository

import be.sgerard.kotlin.model.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<PersonEntity, Long>