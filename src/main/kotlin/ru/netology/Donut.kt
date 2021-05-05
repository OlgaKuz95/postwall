package ru.netology.ru.netology

import java.util.*

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 36,
    val placeholder: Placeholder = Placeholder(),
    val canPublishfreeCopy: Boolean = false,
    val editMode: String = "duration",

    )