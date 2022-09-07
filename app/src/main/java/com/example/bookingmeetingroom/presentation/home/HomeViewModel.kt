package com.example.bookingmeetingroom.presentation.home

import android.os.Build
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.bookingmeetingroom.common.Constants
import com.example.bookingmeetingroom.data.remote.dto.MeetingDto
import com.example.bookingmeetingroom.data.remote.dto.Place
import com.example.bookingmeetingroom.domain.use_case.home.HomeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHomeUseCase: HomeUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state
    lateinit var pass: String
    val date=3434342L
    var allMeeting= arrayListOf(
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
        )
    )
    val _allMeeting = mutableStateOf(MeetingUiState.Meetings(allMeeting))

    init {
        savedStateHandle.get<String>(Constants.PARAM_PASS)?.let {
//                password ->
//            _state.value=password
        }

    }

}