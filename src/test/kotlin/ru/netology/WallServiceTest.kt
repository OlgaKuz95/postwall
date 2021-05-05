package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.ru.netology.*

class WallServiceTest {

    @Test
    fun updateExisting() {
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
                original = null


            )
        )
        service.add(
            Post(
                0,
                2,
                5,
                2,
                "13.12.11",
                "ret",
                2,
                3,
                true,
                Comments(count = 1),
                Copyright(id = 2),
                Likes(count = 8),
                Reposts(count = 7),
                Views(count = 9),
                "post",
                1,
                false,
                false,
                false,
                true,
                false,
                false,
                Donut(paidDuration = 21),
                2,
                original = null
            )
        )
        val update = Post(
            1,
            2,
            6,
            5,
            "13.12.11",
            "ret",
            6,
            5,
            true,
            Comments(count = 6),
            Copyright(id = 5),
            Likes(count = 9),
            Reposts(count = 8),
            Views(count = 10),
            "post",
            2,
            false,
            false,
            false,
            true,
            false,
            false,
            Donut(paidDuration = 32),
            3,
            original = null

        )
        val result = service.update(update)
        assertTrue(result)


    }
}