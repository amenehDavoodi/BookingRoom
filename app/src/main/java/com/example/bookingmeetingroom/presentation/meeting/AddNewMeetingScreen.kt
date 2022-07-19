package com.example.bookingmeetingroom.presentation.meeting

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bookingmeetingroom.R
import com.example.bookingmeetingroom.presentation.Screen
import com.example.bookingmeetingroom.presentation.login.SignInSignUpTopAppBar
import com.example.bookingmeetingroom.presentation.meeting.component.BuildingSelection
import com.example.bookingmeetingroom.presentation.meeting.component.DisplayTimeAndDateMeeting
import com.example.bookingmeetingroom.presentation.meeting.component.TextFieldTitle
import com.example.bookingmeetingroom.presentation.theme.BookingMeetingRoomTheme
import dev.chrisbanes.accompanist.insets.LocalWindowInsets
import dev.chrisbanes.accompanist.insets.systemBarsPadding
import dev.chrisbanes.accompanist.insets.toPaddingValues

//@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AddNewMeetingScreen(navController: NavController) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Scaffold(
            topBar = {
                SignInSignUpTopAppBar(
                    topAppBarText = stringResource(id = R.string.add_new_meeting),
                    onBackPressed = {}
                )
            },
            content =
            {
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
//                    contentPadding =
//                    LocalWindowInsets.current.systemBars.toPaddingValues()
                )  {
                    item {
                        TextFieldTitle(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp, top = 16.dp, bottom = 16.dp),
                            stringResource(R.string.title_meeting)
                        )
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        DisplayTimeAndDateMeeting()
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(teamsList, stringResource(R.string.title_team_selection))
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(buildingList, stringResource(R.string.title_paradis_selecion))
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(stairsList, stringResource(R.string.title_floor_selecion))
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(roomsList, stringResource(R.string.title_room_selecion))
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        Button(
                            onClick = { },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp)
                                .padding( 10.dp),
                            enabled = true
                        ) {
                            Text(
                                text = stringResource(id = R.string.create_save_new_meeting_title)
                            )
                        }
                    }


                }


            }
        )
    }
}


//@Preview(name = "Add new meeting in light theme")
//@Composable
//fun SignInPreview() {
//    BookingMeetingRoomTheme {
//        AddNewMeetingScreen()
//    }
//}
//
//@Preview(name = "Add new meeting in dark theme")
//@Composable
//fun SignInPreviewDark() {
//    BookingMeetingRoomTheme(darkTheme = true) {
//        AddNewMeetingScreen()
//    }
//}