package com.example.bookingmeetingroom.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.bookingmeetingroom.common.Constants
import com.example.bookingmeetingroom.domain.use_case.home.HomeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHomeUseCase: HomeUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state
    lateinit var pass :String
    init {
        savedStateHandle.get<String>(Constants.PARAM_PASS)?.let {
//                password ->
//            _state.value=password
        }
    }

}