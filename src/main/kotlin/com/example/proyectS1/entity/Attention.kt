package com.example.proyectS1.entity

import jakarta.persistence.*
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Client
import java.time.LocalDate

@Entity
@Table(name = "attention")
data class Attention(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "client_id")
    var client: Client,

    @ManyToOne
    @JoinColumn(name = "professional_id")
    var professional: Professional,

    var fecha: LocalDate,
    var descripcion: String
)
