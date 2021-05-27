package ru.netology

import java.util.*

data class Geo(
    val type:String = "plain",
    val coordinates: String = "55N:83E",
    val place:Place = Place(),
)