package ru.netology

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: String,
    val text: String,
    val replyOwnerid: Int,
    val replyPostid: Int,
    val friendsOnly: Boolean,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean = true,
    val markedAsads: Boolean,
    val isFavorite: Boolean,
    val donut: Donut = Donut(),
    val postponedId: Int,
    val copyHistory: Post? = null,
    val geo: Geo = Geo(),
    val attachment: List<Attachment> = emptyList(),
)
