package com.kmacedo.car.interfaces.incoming

import com.kmacedo.car.domain.TravelRequest
import com.kmacedo.car.domain.TravelRequestInput
import com.kmacedo.car.domain.TravelRequestOutput
import com.kmacedo.car.domain.TravelService
import com.kmacedo.car.interfaces.incoming.mapping.TravelRequestMapper
import org.springframework.hateoas.EntityModel
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
@RequestMapping(path = ["/travelRequests"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TravelRequestAPI(
    val travelService: TravelService,
    val mapper: TravelRequestMapper
) {

    @PostMapping
    fun makeTravelRequest(@RequestBody travelRequestInput: TravelRequestInput)
        : EntityModel<TravelRequestOutput> {

        val travelRequest = travelService.saveTravelRequest(mapper.map(travelRequestInput))
        val output = mapper.map(travelRequest)
        return mapper.buildOutputModel(travelRequest, output)
    }

    @GetMapping("/nearby")
    fun listNearbyRequests(@RequestParam currentAddress: String):
            List<EntityModel<TravelRequestOutput>> {
                val requests = travelService.listNearbyTravelRequests(currentAddress)
        return mapper.buildOutputModel(requests)
    }
}