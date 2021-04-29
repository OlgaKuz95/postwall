package ru.netology.ru.netology

import ru.netology.Post

object WallService {
var posts = emptyArray<Post>()
    fun add(post: Post){
        posts += post
    }
    fun update(post: Post): Boolean {
        TODO()
    }
    }


