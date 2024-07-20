package be.sgerard.kotlin.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class PersonEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0,

    val firstName: String?,

    val lastName: String?,

    val email: String?

) {
    constructor(firstName: String?, lastName: String?) : this(null, firstName, lastName, null)

    constructor() : this(null, null)
}
