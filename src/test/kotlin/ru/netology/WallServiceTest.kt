package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.ru.netology.*

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

}