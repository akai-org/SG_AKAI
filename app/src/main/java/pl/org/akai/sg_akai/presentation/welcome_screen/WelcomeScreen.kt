package pl.org.akai.sg_akai.presentation.welcome_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.ui.theme.*

@Preview
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        val image = painterResource(id = R.drawable.ic_welcome_screen)
        Text("Smart Garden", style = SmartGardenTypography.h4, textAlign = TextAlign.Center)
        Text(
            modifier = Modifier.widthIn(max = 240.dp, min = 100.dp),
            text = "Wszystko czego potrzebujesz, by budować armię do ratowania Ziemi jest w Twojej kieszeni",
            fontWeight = FontWeight.Thin,
            textAlign = TextAlign.Center,
        )
        Image(painter = image, contentDescription = "", modifier = Modifier.padding(top = 10.dp))
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 15.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(100),
                contentPadding = PaddingValues(),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Blue300, Green300
                                )
                            )
                        )
                        .padding(horizontal = 25.dp, vertical = 16.dp),
                ) {
                    Text(
                        "Przejdź dalej",
                        color = Color.White
                    )
                }
            }
        }

    }
}