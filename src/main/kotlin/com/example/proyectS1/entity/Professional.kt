package com.example.proyectS1.entity



import jakarta.persistence.*

@Entity
@Table(name = "professional")
data class Professional(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var fullName: String,
    var especialidad: String,
    var email: String
)
