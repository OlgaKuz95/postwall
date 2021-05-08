package ru.netology

data class Postedphoto(
    override val type: String,
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String
) : Attachments