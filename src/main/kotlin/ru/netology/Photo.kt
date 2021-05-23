package ru.netology

data class Photo(
    override val type: String,
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
) : Attachment