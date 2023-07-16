package com.example.bookingmeetingroom.presentation.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.bookingmeetingroom.R
import com.example.bookingmeetingroom.presentation.Screen
import com.example.bookingmeetingroom.presentation.home.component.getAllMeeting
import com.example.bookingmeetingroom.presentation.login.SignInSignUpTopAppBar
import com.example.bookingmeetingroom.presentation.theme.LightGray200
import java.time.LocalDateTime
import java.util.*

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = hiltViewModel()) {
    val email = "dfsdd"
    val password = "dddddfs"
//    val meetingUiState by viewModel.allMeeting
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl)
    {
        Scaffold(
            topBar = {
                SignInSignUpTopAppBar(
                    topAppBarText = stringResource(id = R.string.add_new_meeting),
                    onBackPressed = { }
                )
            },
            content =
            {
//                SelectionContainer {
//
//                    Text(
//                        text = "pass",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(16.dp),
//                        textAlign = TextAlign.Center,
//                        style = TextStyle.Default
//                    )
//                }

                LazyColumn {
                    item {

                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            Row() {

                                CardScreen(
                                    stringResource(id = R.string.add_new_meeting),
                                    onItemClick = {


                                        navController.navigate(Screen.AddMeetingScreen.route +
                                                "/{$email}/{$password}")

                                    },
                                    Icons.Filled.MeetingRoom
                                )
                            }

                        }
                    }
                    item {
                        TopicSelection(
                            Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }

            })
    }


}

@Composable
private fun TopicSelection(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(24.dp),
        modifier = modifier
            // LazyHorizontalGrid has to be constrained in height.
            // However, we can't set a fixed height because the horizontal grid contains
            // vertical text that can be rescaled.
            // When the fontScale is at most 1, we know that the horizontal grid will be at most
            // 240dp tall, so this is an upper bound for when the font scale is at most 1.
            // When the fontScale is greater than 1, the height required by the text inside the
            // horizontal grid will increase by at most the same factor, so 240sp is a valid
            // upper bound for how much space we need in that case.
            // The maximum of these two bounds is therefore a valid upper bound in all cases.
            .heightIn(max = max(240.dp, with(LocalDensity.current) { 240.sp.toDp() }))
            .fillMaxWidth()
    ) {
        items(getAllMeeting()) { item ->
            singleItem(
                title = item.title,
                place = item.place.buildingId + " / " + item.place.stairsId + " / " + item.place.stairsRoomId,
                time = item.time,
                date = item.date,
                state = item.state
            )
        }
    }
}

@Composable
private fun singleItem(
    title: String,
    place: String,
    time: Long,
    date: Long,
    state: Int
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
    )
    {
        Card(
            modifier = Modifier
                .width(80.dp)
                .height(40.dp)
                .padding(5.dp)
                .border(1.dp, Color.Gray)
                .clickable { }
        ) {
            Icon(
                imageVector = NiaIcons.Add, contentDescription = name,
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(text = title, modifier = Modifier
                .size(18.dp)
                .padding(10.dp), color = Color.Black)

        }

    }

}

@Composable
fun CardScreen(
    title: String,
    onItemClick: () -> Unit,
    icon: ImageVector
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable { onItemClick.invoke() },
        shape = RoundedCornerShape(8.dp),
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {
            Icon(
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp),

                imageVector = icon,
                contentDescription = stringResource(id = R.string.back)
            )

            Text(
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.body2,
                text = title
            )


        }

    }
}

@Composable
fun ImageResource(imgResource: Int) {
    val image: Painter = painterResource(id = imgResource)
    Image(painter = image, contentDescription = "")
}

@Preview
@Composable
fun MainScreen() {
    Scaffold(topBar = { }) {
        Surface(
            modifier =
            Modifier.fillMaxSize(),
            color = LightGray200
        ) {
            Row {
//                CardScreen(
//                    stringResource(id = R.string.add_new_meeting),
//                    null, Icons.Filled.MeetingRoom
//                )
            }

        }
    }

}