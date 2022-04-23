package pl.org.akai.sg_akai.presentation.welcome_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.ui.theme.SmartGardenTypography

@Preview
@Composable
fun WelcomeScreen() {
    Column {
        val image = painterResource(id = R.drawable.ic_welcome_screen)
        Text("Smart Garden", style = SmartGardenTypography.h5, textAlign = TextAlign.Center)
        Text(
            modifier = Modifier.padding(horizontal = 20.dp),
            text = "Wszystko czego potrzebujesz, by budować armię do ratowania Ziemi jest w Twojej kieszeni",
            fontWeight = FontWeight.Thin,
            style = SmartGardenTypography.h5,
            textAlign = TextAlign.Center,
        )
        Image(painter = image, contentDescription = "")

    }
}