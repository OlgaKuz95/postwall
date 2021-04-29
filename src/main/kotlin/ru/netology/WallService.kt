package ru.netology.ru.netology

import ru.netology.Post

object WallService {
    private var posts = emptyArray<Post>()


    fun add(post: Post):Post{
        posts += post
        return posts.last()
    }


    fun update(post: Post): Boolean {
        TODO()
    }
    }


