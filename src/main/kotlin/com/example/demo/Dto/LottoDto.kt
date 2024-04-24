package com.example.demo.Dto

data class LottoDto(
    val numbers: List<List<Int>>
)

data class LottoResultRequestDto(
    val numbers: List<Int>,
    val bonusNumber: Int?
)

data class LottoResult(
    val numbers: List<Int>,
    val correctNumbers: LottoResultRequestDto,
    val result: String
)

data class LottoResultResponseDto(
    val index: Int,
    val winningNumbers: LottoResultRequestDto,
    val results: List<LottoResult>
)