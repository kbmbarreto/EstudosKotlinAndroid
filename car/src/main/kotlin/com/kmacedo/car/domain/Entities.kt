package com.kmacedo.car.domain

import javax.validation.constraints.NotNull
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
data class Driver(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val name: String,
    val birthDate: LocalDate
)

data class PatchDriver(
    val name: String?,
    val birthDate: LocalDate?
)

@Entity
data class Passenger(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val name: String
)

data class PatchPassenger(
    val name: String?
)

@Entity
data class TravelRequest(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    val passenger: Passenger,
    val origin: String,
    val destination: String,
    val status: TravelRequestStatus = TravelRequestStatus.CREATED,
    val creationDate: LocalDateTime = LocalDateTime.now()
)

data class TravelRequestInput(
    @get:NotNull(message = "O campo passengerId não pode ser nulo")
    val passengerId: Long?,
    @get:NotEmpty(message = "O campo origin não pode ser nulo")
    val origin: String?,
    @get:NotEmpty(message = "O campo destination não pode ser nulo")
    val destination: String?
)

enum class TravelRequestStatus {
    CREATED, ACCEPTED, REFUSED
}

data class TravelRequestOutput(
    val id: Long,
    val origin: String,
    val destination: String,
    val status: TravelRequestStatus,
    val creationDate: LocalDateTime
)

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(unique = true)
    val username: String,
    val password: String,
    val enabled: Boolean = true,

    @ElementCollection
    val roles: MutableList<String>

)