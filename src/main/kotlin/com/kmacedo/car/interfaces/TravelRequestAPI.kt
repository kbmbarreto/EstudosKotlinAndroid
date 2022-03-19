package com.kmacedo.car.interfaces

import com.kmacedo.car.domain.TravelRequest
import com.kmacedo.car.domain.TravelRequestInput
import com.kmacedo.car.domain.TravelService
import com.kmacedo.car.interfaces.mapping.TravelRequestMapper
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
@RequestMapping(path = ["/travelRequests"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TravelRequestAPI(
    val travelService: TravelService,
    val mapper: TravelRequestMapper) {
    @PostMapping
    fun makeTravelRequest(@RequestBody travelRequestInput: TravelRequestInput) {
        travelService.saveTravelRequest(mapper.map(travelRequestInput))
    }
}