package pl.org.akai.sg_akai.presentation.plant_statistics_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.components.GradientText
import kotlin.jvm.internal.Intrinsics

@Composable
fun PlantStatisticsScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        val image = painterResource(id = R.drawable.plant)
        GradientText(text = "Nazwa rośliny")
        Row {
            Box(Modifier.fillMaxWidth(.5f)) {
                Image(
                    painter = image,
                    contentDescription = "A plant",
                    contentScale = ContentScale.Fit
                )
            }
            Box(Modifier.fillMaxWidth(.5f)) {

            }
        }
    }
}