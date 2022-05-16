package com.example.bookingmeetingroom.presentation.meeting.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun DateAndTimeMeeting() {
    Row(modifier = Modifier.padding(10.dp)) {
        Text(
            text = " انتخاب ساعت جلسه",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        , modifier = Modifier.weight(0.5f)
        ,textAlign = TextAlign.Center
        )
        Text(
            text = " انتخاب زمان جلسه",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
            , modifier = Modifier.weight(0.5f)
            ,textAlign = TextAlign.Center

        )
    }

}
