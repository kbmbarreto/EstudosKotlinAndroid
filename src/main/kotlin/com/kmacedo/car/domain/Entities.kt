package com.kmacedo.car.domain

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*
import javax.print.attribute.standard.DateTimeAtCreation

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
    val passengerId: Long,
    val origin: String,
    val destination: String
)

enum class TravelRequestStatus{
    CREATED, ACCEPTED, REFUSED
}

data class TravelRequestOutput(
    val id: Long,
    val origin: String,
    val destination: String,
    val status: TravelRequestStatus,
    val creationDate: LocalDateTime
)