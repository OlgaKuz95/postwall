package ru.netology.ru.netology

import ru.netology.Post

object WallService {
    private var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }


    fun update(post: Post): Boolean {
        posts.forEachIndexed { index, currentPost ->
         if (currentPost.id == post.id){
             posts[index] = post.copy(date = currentPost.date, ownerId = currentPost.ownerId)
             return true
         }
        }
        return false
    }


}


