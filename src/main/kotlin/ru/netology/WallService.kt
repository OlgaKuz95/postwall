package ru.netology

import ru.netology.ru.netology.PostNotFoundException


object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    private var id = 0


    fun addCopy(post: Post): Post {
        val copy = post.copy(id = id++)
        posts += copy
        return copy
    }

    fun add(post: Post): Post {
        posts += post.copy(id = id++)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        posts.forEachIndexed { index, currentPost ->
            if (currentPost.id == post.id) {
                posts[index] = post.copy(date = currentPost.date, ownerId = currentPost.ownerId)
                return true
            }
        }
        return false
    }


    fun isRepost(copyHistory: Post?): Boolean {
        if (copyHistory != null) {
            return true
        }
        return false
    }

    fun createComment(comment: Comment) {
        try {
            val id = comment.postId
            println("$comment.add")
        } catch (e: PostNotFoundException) {
            println("PostNotFound")
        }
    }


    val post = Post(
        0,
        0,
        0,
        1,
        "12.10.20",
        "text",
        1,
        1,
        true,
        comments = Comments(
            count = 0,
        ),
        copyright = Copyright(
            id = 0,
        ),
        likes = Likes(
            count = 0,
        ),
        reposts = Reposts(
            count = 0,
        ),
        views = Views(
            count = 0,
        ),
        "post",
        1,
        false,
        false,
        false,
        true,
        false,
        false,
        donut = Donut(
            paidDuration = 36,
        ),
        0,
        null,
        geo = Geo(
            type = "plain"
        )
    )

    val repost = Post(
        0,
        0,
        0,
        1,
        "12.10.20",
        "text",
        1,
        1,
        true,
        comments = Comments(
            count = 2,
        ),
        copyright = Copyright(
            id = 0,
        ),
        likes = Likes(
            count = 0,
        ),
        reposts = Reposts(
            count = 0,
        ),
        views = Views(
            count = 0,
        ),
        "post",
        1,
        false,
        false,
        false,
        true,
        false,
        false,
        donut = Donut(
            paidDuration = 36,
        ),
        0,
        geo = Geo(
            type = "plain"
        )
    )

    val comment = Comment(
        0,
        0,
        1,
        "text",
        2,
        null,
        2,
        2
    )
}


