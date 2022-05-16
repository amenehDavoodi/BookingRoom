package com.example.bookingmeetingroom.presentation.meeting

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bookingmeetingroom.R
import com.example.bookingmeetingroom.presentation.login.SignInSignUpTopAppBar
import com.example.bookingmeetingroom.presentation.meeting.component.BuildingSelection
import com.example.bookingmeetingroom.presentation.meeting.component.DateAndTimeMeeting
import com.example.bookingmeetingroom.presentation.meeting.component.TextFieldTitle
import com.example.bookingmeetingroom.presentation.theme.BookingMeetingRoomTheme

//@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AddNewMeetingScreen() {
    Scaffold(
        topBar = {
            SignInSignUpTopAppBar(
                topAppBarText = stringResource(id = R.string.add_new_meeting),
                onBackPressed = { }
            )
        },
        content =
        {
            Column {
                TextFieldTitle(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    "عنوان جلسه"
                )
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))
                DateAndTimeMeeting()
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))
                BuildingSelection(teamsList, "انتخاب تیم")
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))
                BuildingSelection(buildingList, "انتخاب پردیس")
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))
                BuildingSelection(stairsList, "انتخاب طبقه")
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))
                BuildingSelection(roomsList, "انتخاب اتاق")
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))


            }
        }
    )

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