package com.example.proyectS1.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDate

data class AttentionDto(
    val id: Long? = null,

    @field:NotNull(message = "El ID del cliente es obligatorio")
    val clientId: Long,

    @field:NotNull(message = "El ID del profesional es obligatorio")
    val professionalId: Long,

    @field:NotNull(message = "La fecha es obligatoria")
    val fecha: LocalDate,

    val descripcion: String? = null
)
