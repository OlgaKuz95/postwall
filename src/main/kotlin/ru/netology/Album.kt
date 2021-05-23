package ru.netology

data class Album(
    override val type: String = "tet",
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String="text",
    val description: String ="text",
    val created: Int=1,
) : Attachment