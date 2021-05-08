package ru.netology

data class Note(
    override val type: String,
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int
) : Attachments