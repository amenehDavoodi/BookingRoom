package com.example.bookingmeetingroom.domain.repository

import com.example.bookingmeetingroom.data.remote.dto.MeetingDto

interface MeetingRepository {
    suspend fun getMeetings():List<MeetingDto>

}