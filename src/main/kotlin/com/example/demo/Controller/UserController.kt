package com.example.demo.Controller

import com.example.demo.Dto.UserDto
import com.example.demo.Dto.UserRequestDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController {

    private val users = mutableListOf<UserDto>()

    @PostMapping("/login")
    fun login(@RequestBody request: UserRequestDto): String {
        // 입력 값을 받고 서버로 보내서 DB에 email과 password가 맞는지 확인
        return "";
    }

    @PostMapping("/create")
    fun createUser(@RequestBody request: UserDto): ResponseEntity<UserDto> {
        //create로 입력값을 받아 users에 저장
        val user = UserDto(
            fullName = "한진규",
            email = "202030433@daelim.ac.kr",
            password = "1234"
        )
        users.add(user)

        return ResponseEntity.ok().body(user)
    }
}