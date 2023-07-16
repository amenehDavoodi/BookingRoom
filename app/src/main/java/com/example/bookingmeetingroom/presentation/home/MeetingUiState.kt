package com.example.bookingmeetingroom.presentation.home

import com.example.bookingmeetingroom.data.remote.dto.MeetingDto
import com.example.bookingmeetingroom.data.remote.dto.Place

sealed interface MeetingUiState
{
    object Loading : MeetingUiState

    object NoInterestsSelection : MeetingUiState






}