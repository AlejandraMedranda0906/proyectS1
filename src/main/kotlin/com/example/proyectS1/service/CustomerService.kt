package com.example.proyectS1.service

import com.example.proyectS1.dto.CustomerDto
import com.example.proyectS1.entity.Customer
import com.example.proyectS1.mapper.CustomerMapper
import com.example.proyectS1.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository


    fun getCustomers(): List<Customer> {
        return customerRepository .findAll()
    }

    fun save(customerDto: CustomerDto): Customer {
        val customer = CustomerMapper.toEntity(customerDto)
        return customerRepository.save(customer)
    }
}

