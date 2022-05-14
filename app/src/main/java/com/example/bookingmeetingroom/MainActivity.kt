package com.example.bookingmeetingroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bookingmeetingroom.presentation.Screen
import com.example.bookingmeetingroom.presentation.login.SignIn
import com.example.bookingmeetingroom.presentation.login.SignInSignUpScreen
import com.example.bookingmeetingroom.presentation.meeting.AddNewMeetingScreen
import com.example.bookingmeetingroom.presentation.theme.BookingMeetingRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookingApplication()
        }
    }
}
@Composable
fun BookingApplication() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(Screen.LoginScreen.route) {
            SignIn(navController)
        }
        composable(Screen.AddMeetingScreen.route+"/{userName}/{password}") {
            AddNewMeetingScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BookingMeetingRoomTheme {
        BookingApplication()
    }
}