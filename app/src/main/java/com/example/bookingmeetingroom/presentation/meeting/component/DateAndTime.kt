package com.example.bookingmeetingroom.presentation.meeting.component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.bookingmeetingroom.R

@Composable
fun DateAndTimeMeeting(
    title: String,
    onItemClick: (() -> Unit?)?,
    modifier: Modifier,
    icon: ImageVector
) {
    Box(modifier = modifier.clickable { onItemClick?.invoke() }) {
        Row(
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = ""
            )
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center

            )

        }

    }
}

@Composable
fun DisplayTimeAndDateMeeting() {
    Column() {
        Row(
            modifier = Modifier.animateContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        )
        {
            DateAndTimeMeeting(
                stringResource(R.string.title_time), onItemClick = {

                },
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp),
                icon = Icons.Default.AccessTime
            )
        }

        Row(
            modifier = Modifier.animateContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {

            TextFieldTitle(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp)
                    .weight(0.25f),
                label = stringResource(R.string.since_lable)
            )

            TextFieldTitle(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp)
                    .weight(0.25f),
                label = stringResource(R.string.to_lable)
            )

        }
        Row(
            modifier = Modifier.animateContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        )
        {
            DateAndTimeMeeting(
                stringResource(R.string.title_date), onItemClick = {
                },
                Modifier
                    .weight(0.5f)
                    .padding(end = 10.dp),
                icon = Icons.Default.DateRange
            )
        }

        Row(
            modifier = Modifier.animateContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {

            TextFieldTitle(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp)
                    .weight(0.25f),
                label = stringResource(R.string.since_lable)
            )

            TextFieldTitle(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp)
                    .weight(0.25f),
                label = stringResource(R.string.to_lable)
            )

        }
    }

}
