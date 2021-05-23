package ru.netology

data class Doc(
    override val type: String,
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
) : Attachment