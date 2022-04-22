package pl.org.akai.sg_akai.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.poznan.put.michalxpz.core_ui.Dimensions
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import pl.org.akai.sg_akai.ui.theme.SmartGardenTypography

private val LightColorPalette = lightColors(
    primary = WhiteBackground1,
    secondary = WhiteBackground2,
    onPrimary = BlackText
)

private val DarkColorPalette = darkColors(
    primary = BlackBackground1,
    onPrimary = WhiteText,
    secondary = BlackBackground2,
)

@Composable
fun SmartGardenTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = DarkColorPalette

    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = SmartGardenTypography,
            shapes = Shapes,
            content = content
        )
    }
}