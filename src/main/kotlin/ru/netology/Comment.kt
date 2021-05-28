package ru.netology

data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int,
    val message: String,
    val replyTocomment: Int,
   // val attachment: List<Attachment> = emptyList(),
    val parentsStack: Comment? = null,
    val stickerId: Int,
    val guid: Int
)


