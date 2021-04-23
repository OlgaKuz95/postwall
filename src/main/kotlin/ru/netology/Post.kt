package ru.netology


class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date:String,
    val text:String,
    val replyOwnerid: Int,
    val replyPostid:Int,
    //val comments:Object,
    //val copyright:Object,
     likes: Int = 0,
    val reposts: Int = 0,
   // val views: Object,
    val postType: String,
    val signerId: Int,
    val isFavorite: Boolean ,
   // val donut: Object,
    val postponedId: Int,
)
 {
    var likes: Int =likes
     set(value) {
         if(value>=0)
         field = value
     }

}