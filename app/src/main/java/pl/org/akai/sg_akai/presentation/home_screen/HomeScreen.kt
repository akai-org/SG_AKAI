package pl.org.akai.sg_akai.presentation.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import pl.org.akai.components.small_components.SmartGardenSurface
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.components.NiceButton
import pl.org.akai.sg_akai.presentation.home_screen.animatedCircle.AnimatedCircle

@Composable
fun HomeScreen(
    onClick: () -> Unit
) {
    val spacing = LocalSpacing.current

    SmartGardenSurface(
        modifier = Modifier.fillMaxSize().padding(spacing.large)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            val colorStart = MaterialTheme.colors.primary
            val colorEnd = MaterialTheme.colors.secondary

            Text(
                text = "Stan Twojego ogrodu na dziś",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.graphicsLayer(alpha = 0.99f)
                    .drawWithCache {
                        val brush = Brush.horizontalGradient(listOf(colorStart, colorEnd))
                        onDrawWithContent {
                            drawContent()
                            drawRect(brush, blendMode = BlendMode.SrcAtop)
                        }
                    }
                    .align(Alignment.CenterHorizontally)
                    .padding(horizontal = spacing.mediumLarge)
                    .fillMaxSize()
                    .weight(1f)
            )

            AnimatedCircle(
                modifier = Modifier
//                            .align(Alignment.Center)
                    .fillMaxSize()
                    .weight(1f),
                proportions = listOf(0.4f, 0.14f, 0.34f, 0.2f)
            )

            Spacer(modifier = Modifier.height(spacing.mediumSmall))
            Text(
                text = "Produkcja tlenu i wilgotności roślin",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.graphicsLayer(alpha = 0.99f)
                    .drawWithCache {
                        val brush = Brush.horizontalGradient(listOf(colorStart, colorEnd))
                        onDrawWithContent {
                            drawContent()
                            drawRect(brush, blendMode = BlendMode.SrcAtop)
                        }
                    }
                    .fillMaxSize()
                    .padding(top = spacing.mediumLarge)
                    .weight(1f)
            )
            Image(
                painter = painterResource(R.drawable.ic_graph),
                contentDescription = null,
                modifier = Modifier.fillMaxSize().weight(2f)
            )
            Spacer(modifier = Modifier.height(spacing.mediumSmall))
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.fillMaxSize().weight(1f)
            ) {
                NiceButton(text = "Przejdź do ogrodu", onClick = { onClick() },)
            }

        }
    }
}







