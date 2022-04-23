package pl.org.akai.sg_akai.presentation.plant_list_screen

import android.graphics.Color
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow.Companion.Clip
import androidx.compose.ui.unit.dp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.ui.theme.*

val numbers: Array<Int> = Array(100) { it + 1 }

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PlantListScreen(onClick: Any) {
    GridExample(numbers)
}

@Composable
fun PlantItem(number: Int) {

    Column(
        Modifier
            .padding(8.dp)
            .height(250.dp)
            .background(LightGray.copy(alpha= 0.3F),RoundedCornerShape(30.dp))
            .clip(RoundedCornerShape(30.dp)),
        Arrangement.Center,
        Alignment.CenterHorizontally


    ){
        val shape = RoundedCornerShape(16.dp)
        Box(
            Modifier
                .padding(10.dp)
                .background(Green100,shape)
                .clip(shape)
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(R.drawable.ic_plant_leaf_svgrepo_com__1_),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(125.dp)
            )
        }

        Text("Nazwa Roślinki", style = SmartGardenTypography.body1)
        Text( "19 December 2019", style = SmartGardenTypography.body2)
    }
}

@ExperimentalFoundationApi
@Composable
fun GridExample(numbers: Array<Int>) {
    // Lazy Vertical grid
    LazyVerticalGrid(
        // fix the item in one row to be 2.
        cells = GridCells.Fixed(2),

        contentPadding = PaddingValues(8.dp),

        ) {
        item {
            PlantItem(number = 0)
        }
        items(10) {
            PlantItem(number = it)
        }
        itemsIndexed(numbers) { index, item ->
            PlantItem(number = index)
        }
    }
}
