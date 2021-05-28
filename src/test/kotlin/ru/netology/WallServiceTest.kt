package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import ru.netology.ru.netology.PostNotFoundException

class WallServiceTest {

    @Test
    fun update() {
        val service = WallService
        service.add(
            Post(
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
        )
        service.add(
            Post(
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
        )
        val update = Post(
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

        val result = service.update(update)
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)


    fun createComment(comment: Comment) {
        val ownerId = 0
        val postId = 0
        val fromGroup = 1
        val message = "Text"
        val replyTocomment = 2
        val parentsStack: Comment? = null
        val stickerId = 2
        val guid = 2
        val id = 1

        if(  WallService.id == comment.postId) {
            println("$comment.add")
        } else (throw PostNotFoundException())


        val result = Comment(
            ownerId = ownerId,
            postId = postId,
            fromGroup = fromGroup,
            message = message,
            replyTocomment = replyTocomment,
            parentsStack = parentsStack,
            stickerId = stickerId,
            guid = guid
        )
        val expected = PostNotFoundException::class
        assertEquals(expected, result)
    }


}






