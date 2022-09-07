package com.example.bookingmeetingroom.presentation.home.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeLazyHorizontalLazyListScreen()
{
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2)
    ) {
//        items{it->
//            RestaurantItem(r = it, modifier = Modifier.fillParentMaxWidth(0.8f))
//        }
    }

}

//@Composable
//@ExperimentalFoundationApi
//private fun FixedLazyGrid(
//    nRows: Int,
//    modifier: Modifier = Modifier,
//    state: LazyListState = rememberLazyListState(),
//    contentPadding: PaddingValues = PaddingValues(0.dp),
//    scope: LazyGridScopeImpl
//) {
//    val columns = (scope.totalSize + nRows - 1) / nRows
//    LazyRow(
//        modifier = modifier,
//        state = state,
//        contentPadding = contentPadding,
//    ) {
//        items(columns) { columnIndex ->
//            Column {
//                for (rowIndex in 0 until nRows) {
//                    val itemIndex = columnIndex * nRows + rowIndex
//                    if (itemIndex < scope.totalSize) {
//                        Box(
//                            modifier = Modifier.wrapContentSize(),
//                            propagateMinConstraints = true
//                        ) {
//                            scope.contentFor(itemIndex, this@items).invoke()
//                        }
//                    } else {
//                        Spacer(Modifier.weight(1f, fill = true))
//                    }
//                }
//            }
//        }
//    }
//}