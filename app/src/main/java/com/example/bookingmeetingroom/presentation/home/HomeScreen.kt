@file:OptIn(ExperimentalMaterialApi::class)

package com.example.bookingmeetingroom.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bookingmeetingroom.R
import com.example.bookingmeetingroom.presentation.Screen
import com.example.bookingmeetingroom.presentation.login.SignInSignUpTopAppBar
import com.example.bookingmeetingroom.presentation.theme.LightGray200

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = hiltViewModel()) {
    val email = "dfsdd"
    val password = "dddddfs"
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
//                val pass = viewModel.pass
//                SelectionContainer {
//
//                    Text(
//                        text = pass,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(16.dp),
//                        textAlign = TextAlign.Center,
//                        style = Typography.body2
//                    )
//                }

                LazyColumn {
                    item {
                        CardScreen(
                            stringResource(id = R.string.add_new_meeting),
                            onItemClick = {


                                navController.navigate(Screen.AddMeetingScreen.route + "/{$email}/{$password}")
//                                navController.navigate(Screen.LoginScreen.route)

                            },
                            Icons.Filled.MeetingRoom
                        )
                    }
                }

            })
    }


}

@Composable
fun CardScreen(
    title: String,
    onItemClick: () -> Unit,
    icon: ImageVector
) {
    Card(

        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(16.dp)
            .width(100.dp)
            .height(120.dp)
    , onClick = { onItemClick.invoke() }
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