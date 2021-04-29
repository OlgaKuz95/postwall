package ru.netology

import ru.netology.ru.netology.*




data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date:String,
    val text:String,
    val replyOwnerid: Int,
    val replyPostid:Int,
    val friendsOnly:Boolean,
    val comments: Comments = Comments(),
    val copyright:Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts:Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit:Boolean,
    val isPinned:Boolean = true,
    val markedAsads:Boolean,
    val isFavorite: Boolean,
    val donut:Donut = Donut(),
    val postponedId: Int,
    val original:Post?,
) {
    fun isRepost(): Boolean {
        if (original != null) {
            return true
        }
        return false
    }
    fun canPin(): Boolean {
        if (canPin != null) {
            return true
        }
        return false
    }

}