package com.kmacedo.car.interfaces.incoming

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort

//Teste de integração

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PassengerAPITestIT {

    @LocalServerPort
    private var port: Int = 0

    @BeforeEach
    fun setup(){
        RestAssured.port = port
    }

    @Test
    fun testCreatePassenger(){
        val createPassengerJSON = """
            {"name":"Kleber Barreto"}
            """.trimIndent()
    }
}