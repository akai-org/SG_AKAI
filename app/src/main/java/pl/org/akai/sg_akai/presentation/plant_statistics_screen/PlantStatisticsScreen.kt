package pl.org.akai.sg_akai.presentation.plant_statistics_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.components.GradientText
import pl.org.akai.sg_akai.ui.theme.*

@Composable
fun PlantStatisticsScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        val image = painterResource(id = R.drawable.plant)
        GradientText(
            text = "Nazwa rośliny",
            brush = Brush.horizontalGradient(listOf(Blue100, Green100))
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
            ) {
                Image(
                    painter = image,
                    contentDescription = "A plant",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth(.6f)
                        .padding(start = 15.dp)
                )
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Canvas(modifier = Modifier.size(400.dp), onDraw = {
                    drawCircle(
                        color = Green100,
                        radius = 600f,
                        center = Offset(size.width, size.height / 2f)
                    )
                })
                Column(
                    horizontalAlignment = Alignment.End, modifier = Modifier
                        .padding(top = 50.dp, end = 15.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        "Sansewieria\ngwinejska",
                        textAlign = TextAlign.Center,
                        color = Green700,
                        style = SmartGardenTypography.button,
                        fontWeight = FontWeight.Black,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "20 tygodni",
                        style = SmartGardenTypography.caption,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column {
                            val sunImage = painterResource(id = R.drawable.ic_sun)
                            Image(painter = sunImage, contentDescription = "Sun")
                            Text(
                                text = "25%",
                                style = SmartGardenTypography.overline,
                                fontWeight = FontWeight.Black
                            )

                            Spacer(modifier = Modifier.height(30.dp))
                            val thermometerImage = painterResource(id = R.drawable.ic_thermometer)
                            Image(painter = thermometerImage, contentDescription = "Sun")
                            Text(
                                text = "20 °C",
                                style = SmartGardenTypography.overline,
                                fontWeight = FontWeight.Black
                            )
                        }
                        Column {
                            val wateringImage = painterResource(id = R.drawable.ic_watering_can)
                            Image(painter = wateringImage, contentDescription = "Sun")
                            Text(
                                text = "za 5 dni",
                                style = SmartGardenTypography.overline,
                                fontWeight = FontWeight.Black
                            )

                            Spacer(modifier = Modifier.height(30.dp))

                            val lightBulbImage = painterResource(id = R.drawable.ic_light_bulb)
                            Image(painter = lightBulbImage, contentDescription = "Sun")
                            Text(
                                text = "Popularna nazwa tej rośliny doniczkowej to język teściowej",
                                modifier = Modifier.widthIn(max = 65.dp),
                                style = SmartGardenTypography.overline,
                                fontWeight = FontWeight.Black
                            )
                        }
                    }
                }
            }
        }
    }
}