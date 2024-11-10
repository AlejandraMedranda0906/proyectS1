package com.example.proyectS1.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class ProfessionalDto(
    val id: Long? = null,

    @field:NotBlank(message = "El nombre completo es obligatorio")
    val fullName: String,

    @field:NotBlank(message = "La especialidad es obligatoria")
    val especialidad: String? = null,

    @field:NotBlank(message = "El correo debe tener un formato válido")
    val email: String? = null
)
