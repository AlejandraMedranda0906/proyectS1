package com.example.proyectS1.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {

    @NotNull(message = "Full name cannot be null")
    @NotBlank(message = "Full name is required")

    var fullName: String? = null

    @NotNull(message = "Email cannot be null")
    @NotBlank(message = "Email is required")

    var email: String? = null

    @field:NotBlank(message = "El teléfono es obligatorio")
    val phone: String? = null
}
