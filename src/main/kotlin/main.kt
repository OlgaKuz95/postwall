package ru.netology

import ru.netology.ru.netology.*

fun main()
{
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
        copyright = Copyright (
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
        copyright = Copyright (
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
        original = post
        )

print(repost.original?.id)
}

