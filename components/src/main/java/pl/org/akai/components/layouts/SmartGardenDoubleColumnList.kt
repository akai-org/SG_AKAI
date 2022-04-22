package pl.org.akai.components.layouts

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import pl.org.akai.components.small_components.MyButton
import pl.org.akai.components.small_components.SmartGardenCard

@Composable
fun SmartCalcDoubleColumnList (
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column {
        Spacer(modifier = Modifier.height(LocalSpacing.current.mediumSmall))
        Layout(
            content = content,
            modifier = Modifier
        )
        { measurables, constraints ->
            val placeables = measurables.map { measurable ->
                measurable.measure(constraints)
            }

            layout(constraints.maxWidth, constraints.maxHeight) {
                var x_pos = 0
                var y_pos_first = 0
                var y_pos_second = 0
                placeables.forEachIndexed { index, placeable ->
                    val y_value = if (index % 2 == 0) y_pos_first else y_pos_second
                    placeable.placeRelative(x = x_pos, y = y_value)
                    x_pos = if (x_pos == 0) constraints.maxWidth/2 else 0
                    if (index % 2 == 0) y_pos_first += placeable.height else y_pos_second += placeable.height
                }
            }
        }
    }
}

@Preview("coulumn", showSystemUi = true, showBackground = true)
@Composable
fun MyButtonPreview() {
    Scaffold() {

        SmartCalcDoubleColumnList(
            modifier = Modifier.fillMaxSize(),
            content = {
            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.mediumSmall))
                    Text(text = "THUMBS UP")
                }
            }
            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.default))
                    Text(text = "THUMBS UP")
                }
            }

            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.mediumLarge))
                    Text(text = "THUMBS UP")
                }
            }



            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.large))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.extraSmall))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.default))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.small))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.mediumSmall))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.mediumSmall))
                    Text(text = "THUMBS UP")
                }
            }


            SmartGardenCard(
            ) {
                Column {
                    Icon(imageVector = Icons.Filled.ThumbUp, contentDescription = null)
                    Spacer(modifier = Modifier.height(LocalSpacing.current.extraSmall))
                    Text(text = "THUMBS UP")
                }
            }
        }
        )
    }
}