package com.kmacedo.car.interfaces.mapping

import com.kmacedo.car.domain.PassengerRepository
import com.kmacedo.car.domain.TravelRequest
import com.kmacedo.car.domain.TravelRequestInput
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException

@Component
class TravelRequestMapper(val passengerRepository: PassengerRepository) {

    fun map(input: TravelRequestInput) : TravelRequest {
        val passenger = passengerRepository.findById(input.passengerId)
            .orElseThrow {ResponseStatusException(HttpStatus.NOT_FOUND)}

    return TravelRequest(passenger = passenger, origin = input.origin, destination = input.destination)
    }
}