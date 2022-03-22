package com.kmacedo.car.domain

import org.springframework.data.jpa.repository.JpaRepository

interface DriverRepository : JpaRepository<Driver, Long>

interface PassengerRepository: JpaRepository<Passenger, Long>

interface TravelRequestRepository: JpaRepository<TravelRequest, Long>{
    fun findByStatus(status: TravelRequestStatus): List<TravelRequest>
}

//   Só o que fizemos para criar o mapeamento do método para o banco de dados foi chamar o método de findByStatus. Isso
// faz com que o método siga uma convenção do próprio Spring Data e, portanto, que o framework já faça o mapeamento
// automático para uma query de banco de dados. Caso não queiramos utilizar essa convenção, bata utilizar a anotação
// @Query .