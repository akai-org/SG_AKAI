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
    primary = Green500,
    primaryVariant = Green300,
    secondary = PInk500,
    secondaryVariant = PInk300,
    onPrimary = BlackText,
    onError = Red,
    onSecondary = WhiteText
)

private val DarkColorPalette = darkColors(
    primary = Green700,
    primaryVariant = Green900,
    secondary = PInk700,
    secondaryVariant = PInk900,
    onPrimary = BlackText,
    onError = Red,
    onSecondary = WhiteText
)

@Composable
fun SmartGardenTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette

    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = SmartGardenTypography,
            shapes = Shapes,
            content = content
        )
    }
}