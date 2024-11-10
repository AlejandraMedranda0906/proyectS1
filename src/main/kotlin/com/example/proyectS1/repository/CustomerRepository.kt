package com.example.proyectS1.repository

import com.example.proyectS1.entity.Attention
import com.example.proyectS1.entity.Customer
import com.example.proyectS1.entity.Professional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:JpaRepository<Customer, Long>{
    interface ProfessionalRepository : JpaRepository<Professional, Long>
    interface AttentionRepository : JpaRepository<Attention, Long>




}