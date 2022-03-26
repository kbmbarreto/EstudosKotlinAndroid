package com.kmacedo.car.interfaces.incoming.errorhandling

data class ErrorData(
    val message: String
    )

data class ErrorResponse(
    val errors: List<ErrorData>
)