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

    var firstName: String?,

    var lastName: String?,

    var email: String?

) {
    constructor(firstName: String?, lastName: String?) : this(null, firstName, lastName, null)

    constructor() : this(null, null)
}
