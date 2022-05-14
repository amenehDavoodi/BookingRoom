package com.example.bookingmeetingroom.data.repository

import com.example.bookingmeetingroom.data.remote.ApiMeeting
import com.example.bookingmeetingroom.data.remote.dto.MeetingDto
import com.example.bookingmeetingroom.domain.repository.MeetingRepository
import javax.inject.Inject

class MeetingRepositoryImpl @Inject constructor(
    private val api: ApiMeeting
) : MeetingRepository {
    override suspend fun getMeetings():List<MeetingDto> {
        return api.getAllMeetings()
    }


}