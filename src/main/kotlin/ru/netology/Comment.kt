package ru.netology

import ru.netology.ru.netology.Comments

data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int,
    val message: String,
    val replyTocomment: Int,
    //val attachments: Attachments,
    val parentsStack: Comment? = null,
    val stickerId: Int,
    val guid: Int
)


