package com.example.bookingmeetingroom.data.remote

import com.example.bookingmeetingroom.data.remote.dto.MeetingDto
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiMeeting {

    @GET("")
    suspend fun getAllMeetings():List<MeetingDto>

    @GET("")
    suspend fun getMeetingById(@Path("meetingId") meetingId: String)

    @POST
    suspend fun setMeeting()
}