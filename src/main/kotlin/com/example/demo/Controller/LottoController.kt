package com.example.demo.Controller

import com.example.demo.Dto.LottoDto
import com.example.demo.Dto.LottoResultResponseDto
import com.example.demo.Dto.UserRequestDto
import org.springframework.http.HttpRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ThreadLocalRandom


@RestController
@RequestMapping("/lotto")
class LottoController {
    @GetMapping
    fun getLotto(@RequestBody request: LottoDto): ResponseEntity<List<Int>> {
        //로또 숫자만들기
        val lottoNumber = generateUniqueLottoNumbers()

        return ResponseEntity.ok(lottoNumber)
    }
    private fun generateUniqueLottoNumbers(): List<Int> {
        val lottoNumberCount = 6
        val minNumber = 1
        val maxNumber = 45

        val lottoNumbers = mutableSetOf<Int>()

        //로또 숫자 만들기
        while (lottoNumbers.size < lottoNumberCount) {
            val randomNumber = ThreadLocalRandom.current().nextInt(minNumber, maxNumber + 1)
            lottoNumbers.add(randomNumber)
        }

        return lottoNumbers.toList().sorted()
    }

    @GetMapping("/check")
    fun checkLotto(): ResponseEntity<LottoResultResponseDto> {
        // 로또 당첨 결과를 조회
    }
}