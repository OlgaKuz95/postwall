package ru.netology

data class Video(
    override val type: String,
    val id:Int,
    val ownerId:Int,
    val title:String,
    val description:String,
    val duration:Int,
    )
    : Attachment
