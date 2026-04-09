package com.musin.calculate

import androidx.compose.runtime.mutableStateOf

class CalculatorViewModel {

    val state = mutableStateOf(
        Display(
            expression = "45x8",
            result = "360"
        )
    )

    fun processUserInput(input: String) {
        when(input) {
            "AC" -> state.value = Display(
                expression = "",
                result = ""
            )
            "1" -> state.value = Display(
                expression = input,
                result = ""
            )
            "2" -> state.value = Display(
                expression = "",
                result = input
            )
        }
    }
}

data class Display(
    val expression: String,
    val result: String
)