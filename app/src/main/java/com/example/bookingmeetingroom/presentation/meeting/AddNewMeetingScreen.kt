package com.example.bookingmeetingroom.presentation.meeting

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.bookingmeetingroom.R
import com.example.bookingmeetingroom.presentation.login.SignInSignUpTopAppBar
import com.example.bookingmeetingroom.presentation.meeting.component.BuildingSelection
import com.example.bookingmeetingroom.presentation.meeting.component.DisplayTimeAndDateMeeting
import com.example.bookingmeetingroom.presentation.meeting.component.TextFieldTitle
import com.example.bookingmeetingroom.presentation.theme.BookingMeetingRoomTheme

//@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AddNewMeetingScreen() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Scaffold(
            topBar = {
                SignInSignUpTopAppBar(
                    topAppBarText = stringResource(id = R.string.add_new_meeting),
                    onBackPressed = { }
                )
            },
            content =
            {
                LazyColumn {
                    item {
                        TextFieldTitle(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp),
                            "عنوان جلسه"
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
                        BuildingSelection(teamsList, "انتخاب تیم")
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(buildingList, "انتخاب پردیس")
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(stairsList, "انتخاب طبقه")
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                        BuildingSelection(roomsList, "انتخاب اتاق")
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        )
                    }


                }
            }
        )
    }
}


@Preview(name = "Add new meeting in light theme")
@Composable
fun SignInPreview() {
    BookingMeetingRoomTheme {
        AddNewMeetingScreen()
    }
}

@Preview(name = "Add new meeting in dark theme")
@Composable
fun SignInPreviewDark() {
    BookingMeetingRoomTheme(darkTheme = true) {
        AddNewMeetingScreen()
    }
}