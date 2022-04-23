package pl.org.akai.sg_akai.presentation.welcome_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.components.GradientText
import pl.org.akai.sg_akai.components.NiceButton
import pl.org.akai.sg_akai.ui.theme.*

@Composable
fun WelcomeScreen(
    onNextClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        val image = painterResource(id = R.drawable.ic_welcome_screen)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            GradientText(text = "Smart Garden")
            Text(
                modifier = Modifier.widthIn(max = 240.dp, min = 100.dp),
                text = "Wszystko czego potrzebujesz, by budować armię do ratowania Ziemi jest w Twojej kieszeni",
                style = SmartGardenTypography.caption,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
            )
        }
        Image(painter = image, contentDescription = "", modifier = Modifier.padding(top = 10.dp))
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 15.dp)
        ) {
            NiceButton(text = "Przejdź Dalej", onClick = { onNextClick() }, modifier = Modifier)
        }

    }
}