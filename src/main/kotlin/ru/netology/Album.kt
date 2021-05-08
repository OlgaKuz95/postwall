package ru.netology

data class Album(
    override val type: String,
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val created: Int,
) : Attachments