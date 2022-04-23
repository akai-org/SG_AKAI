package pl.org.akai.sg_akai.presentation.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import pl.org.akai.components.small_components.SmartGardenSurface
import pl.org.akai.sg_akai.R
import pl.org.akai.sg_akai.presentation.home_screen.animatedCircle.AnimatedCircle

@Composable
fun HomeScreen(
    onClick: () -> Unit
) {
    val spacing = LocalSpacing.current

    SmartGardenSurface(
        modifier = Modifier.fillMaxSize().padding(spacing.mediumSmall)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
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
                    .padding(top = spacing.mediumLarge)
            )

            Spacer(modifier = Modifier.height(spacing.mediumSmall))

            Text(
                text = "Produkcja tlenu i wilgotności roślin",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.graphicsLayer(alpha = 0.99f)
                    .drawWithCache {
                        val brush = Brush.horizontalGradient(listOf(colorStart, colorEnd))
                        onDrawWithContent {
                            drawContent()
                            drawRect(brush, blendMode = BlendMode.SrcAtop)
                        }
                    }
                    .align(Alignment.CenterHorizontally)
                    .padding(top = spacing.mediumLarge)
            )

            AnimatedCircle(
                proportions = listOf(0.3f, 0.5f, 0.6f),
                colors = listOf(MaterialTheme.colors.primary, MaterialTheme.colors.secondary, MaterialTheme.colors.primaryVariant),
                modifier = Modifier
            )

            Image(
                painter = painterResource(R.drawable.ic_graph),
                contentDescription = null
            )

            Button(
                onClick = { onClick() }
            ) {
                Text(text = "Przejdź do ogrodu")
            }

        }
    }
}