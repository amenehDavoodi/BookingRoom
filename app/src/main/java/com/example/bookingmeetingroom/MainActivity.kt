package com.example.bookingmeetingroom

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ContentView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bookingmeetingroom.presentation.Screen
import com.example.bookingmeetingroom.presentation.home.HomeScreen
import com.example.bookingmeetingroom.presentation.login.SignIn
import com.example.bookingmeetingroom.presentation.meeting.AddNewMeetingScreen
import com.example.bookingmeetingroom.presentation.theme.BookingMeetingRoomTheme
import dagger.hilt.android.AndroidEntryPoint
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets
import dev.chrisbanes.accompanist.insets.systemBarsPadding

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
              //  calculateWindowSizeClass(this)
                BookingApplication()

            }

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
//        composable(Screen.HomeScreen.route) {
//            val userName = "dsfdf"
//            val password = "sdfsdf"
//            HomeScreen()
//        }
        composable(Screen.HomeScreen.route + "/{userName}/{password}") {
            HomeScreen(navController)
        }
        composable(Screen.AddMeetingScreen.route + "/{userName}/{password}") {
            AddNewMeetingScreen(navController)
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
/*
@ExperimentalMaterial3WindowSizeClassApi
@Composable
fun calculateWindowSizeClass(activity: Activity): WindowSizeClass {
    // Observe view configuration changes and recalculate the size class on each change. We can't
    // use Activity#onConfigurationChanged as this will sometimes fail to be called on different
    // API levels, hence why this function needs to be @Composable so we can observe the
    // ComposeView's configuration changes.
    LocalConfiguration.current
    val density = LocalDensity.current
    val metrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(activity)
    val size = with(density) { metrics.bounds.toComposeRect().size.toDpSize() }
    return WindowSizeClass.calculateFromSize(size)
}*/
