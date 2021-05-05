package ru.netology

import ru.netology.ru.netology.*

fun main() {
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
        original = post
    )
    val copy = post.copy(
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
        ), copyright = Copyright(
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
        original = null
    )
    val (
        id,
        _,
        fromId,
        createdBy,
        _,
        text,
        replyOwnerid,
        replyPostid,
        friendsOnly,
        comments,
        copyright,
        likes,
        reposts,
        views,
        postType,
        signerId,
        canPin,
        canDelete,
        canEdit,
        isPinned,
        markedAsads,
        isFavorite,
        donut,
        postponedId,
    ) = copy

    print(repost.original?.id)
}

