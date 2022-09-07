package com.example.bookingmeetingroom.data.remote.dto

import java.util.*

data class MeetingDto(
    val id: String,
    val title: String,
    val place: Place,
    val time: Long,
    val date: Long,
    val state:Int
)
