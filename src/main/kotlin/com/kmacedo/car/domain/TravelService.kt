package com.kmacedo.car.domain

import com.kmacedo.car.interfaces.outcoming.GMapsService
import org.springframework.stereotype.Component
import java.net.Inet4Address

@Component
class TravelService(
    val travelRequestRepository: TravelRequestRepository,
    val gMapsService: GMapsService) {

    val MAX_TRAVEL_TIME: Int = 600

    fun saveTravelRequest(travelRequest: TravelRequest) = travelRequestRepository.save(travelRequest)

    fun listNearbyTravelRequests(currentAddress: String): List<TravelRequest> {
        val requests = travelRequestRepository.findByStatus(TravelRequestStatus.CREATED) //Recupera do banco de dados
        return requests.filter {
            tr -> gMapsService.getDistanceBetweenAddressses(currentAddress, tr.origin) < MAX_TRAVEL_TIME
        }
    }
}