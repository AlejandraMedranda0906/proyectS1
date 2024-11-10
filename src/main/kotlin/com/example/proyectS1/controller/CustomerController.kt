package com.example.proyectS1.controller


import com.example.proyectS1.dto.CustomerDto
import com.example.proyectS1.entity.Customer
import com.example.proyectS1.service.CustomerService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/Customers")

class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers() = customerService.getCustomers()

    @PostMapping
    fun save (@RequestBody @Valid customerDto: CustomerDto):Customer{
        return customerService.save(customerDto)
    }
}