package pl.org.akai.sg_akai.presentation.plant_statistics_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.components.GradientText
import pl.org.akai.sg_akai.ui.theme.Blue100
import pl.org.akai.sg_akai.ui.theme.Green100
import pl.org.akai.sg_akai.ui.theme.SmartGardenTypography
import kotlin.jvm.internal.Intrinsics

@Composable
fun PlantStatisticsScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding()
    ) {
        val image = painterResource(id = R.drawable.plant)
        GradientText(
            text = "Nazwa rośliny",
            brush = Brush.horizontalGradient(listOf(Blue100, Green100))
        )
        Row {
            Box(
                Modifier
                    .fillMaxWidth(.5f)
            ) {
                Image(
                    painter = image,
                    contentDescription = "A plant",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth(.6f)

                )
            }
            Box(Modifier.fillMaxWidth(.5f)) {
                Canvas(modifier = Modifier.size(400.dp), onDraw = {
                    drawCircle(
                        color = Green100,
                        radius = 600f,
                        center = Offset(size.width * 1.5f, size.height / 2f)
                    )
                })
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        "Sansewieria\ngwinejska",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        style = SmartGardenTypography.button,
                        fontWeight = FontWeight.Black,
                        fontSize = 13.sp
                    )
                    Text(
                        text = "20 tygodni",
                        style = SmartGardenTypography.caption,
                        fontWeight = FontWeight.Black
                    )
                }
            }
        }
    }
}