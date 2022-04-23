package pl.org.akai.sg_akai.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import pl.org.akai.sg_akai.ui.theme.Blue300
import pl.org.akai.sg_akai.ui.theme.Green300
import pl.org.akai.sg_akai.ui.theme.SmartGardenTypography

@Composable
fun GradientText(text: String, brush: Brush = Brush.horizontalGradient(listOf(Blue300, Green300))) {
    Text(
        text,
        style = SmartGardenTypography.h4,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .graphicsLayer(alpha = 0.99f)
            .drawWithCache {
                onDrawWithContent {
                    drawContent()
                    drawRect(brush, blendMode = BlendMode.SrcAtop)
                }
            }
    )
}