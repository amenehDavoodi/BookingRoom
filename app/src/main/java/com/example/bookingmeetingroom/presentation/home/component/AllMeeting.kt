package com.example.bookingmeetingroom.presentation.home.component

import com.example.bookingmeetingroom.data.remote.dto.MeetingDto
import com.example.bookingmeetingroom.data.remote.dto.Place

fun getAllMeeting():ArrayList<MeetingDto>{
    val date=1111455L
    return arrayListOf(
        MeetingDto(
            "1", "جلسه رترو1", Place("1", "300", "1", "2"),
            12321354,date,1),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354,date,2),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354,date,1),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354,date,2),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,1
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,2
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        ),
        MeetingDto(
            "2", "جلسه رترو2", Place("2", "200", "3", "2"),
            12321354, date,3
        )
    )
}