package com.example.proyectS1.mapper


import com.example.proyectS1.dto.CustomerDto
import com.example.proyectS1.entity.Customer



object CustomerMapper {

    fun toEntity(customerDto: CustomerDto): Customer {

        val customer = Customer()
        customer.fullName = customerDto.fullName
        customer.email = customerDto.email
        return customer

    }


}