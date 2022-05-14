package com.example.bookingmeetingroom.presentation

sealed class Screen(val route: String) {
    object LoginScreen: Screen("login_screen")
    object AddMeetingScreen: Screen("add_meeting_screen")
}
