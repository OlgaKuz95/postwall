package ru.netology

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


    fun createComment() {
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

        service.add (Post(
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
        ))


        service.createComment(createComment)
    }
}






