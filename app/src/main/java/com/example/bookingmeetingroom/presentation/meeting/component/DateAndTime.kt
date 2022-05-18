package com.example.bookingmeetingroom.presentation.meeting.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun DateAndTimeMeeting(title: String, onItemClick: (() -> Unit?)?,modifer:Modifier) {

    Text(
        text = title,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = modifer.clickable { onItemClick },
        textAlign = TextAlign.Center
    )

}

@Composable
fun DisplayTimeAndDateMeeting() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        DateAndTimeMeeting("انتخاب زمان جلسه", onItemClick = {

        },
            Modifier
                .weight(0.5f)
                .padding(start = 10.dp))
        DateAndTimeMeeting("انتخاب تاریخ جلسه", onItemClick ={
//            MaterialDatePicker.Builder
//                .datePicker()
//                .setTitleText("تاریخ را انتخاب کنید.")
//                .build()
        },
            Modifier
                .weight(0.5f)
                .padding(end = 10.dp))
    }
}
