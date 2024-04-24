package com.example.demo.Dto

data class UserRequestDto(
    val email: String,
    val password: String
)

data class UserDto(
    val fullName: String,
    val email: String,
    val password: String
)
