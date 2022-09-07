package com.example.bookingmeetingroom.presentation.home

import com.example.bookingmeetingroom.data.remote.dto.MeetingDto

sealed interface MeetingUiState
{
    object Loading : MeetingUiState

    object NoInterestsSelection : MeetingUiState

    data class Meetings(
        val allMeeting: List<MeetingDto>
        ) : MeetingUiState {
    }


}