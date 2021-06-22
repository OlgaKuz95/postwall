package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import ru.netology.ru.netology.PostNotFoundException

class WallServiceTest {
    val service = WallService

    @Test
    fun update() {
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
    fun createComment_PostNotFoundException() {
        val createComment = Comment(
            0,
            0,
            1,
            "Text",
            2,
            null,
            2,
            2
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
        val result = service.createComment(createComment)
        assertEquals(createComment, result)    }

    @Test
    fun createCommentExistentPost_commentReturned() {
        val createComment = Comment(
            ownerId = 0,
            postId = 0,
            fromGroup = 1,
            message = "Text",
            replyTocomment = 2,
            parentsStack = null,
            stickerId = 2,
            guid = 2
        )

        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 0,
                createdBy = 1,
                date = "12.10.20",
                text = "text",
                replyOwnerid = 1,
                replyPostid = 1,
                friendsOnly = true,
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
                postType = "post",
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = true,
                markedAsads = false,
                isFavorite = false,
                donut = Donut(
                    paidDuration = 36,
                ),
                postponedId = 0,
                copyHistory = null,
                geo = Geo(
                    type = "plain"
                )
            )
        )


        val result = service.createComment(createComment)
        assertEquals(createComment, result)
    }
}






