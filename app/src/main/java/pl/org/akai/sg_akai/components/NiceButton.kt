package pl.org.akai.sg_akai.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import pl.org.akai.sg_akai.ui.theme.Blue300
import pl.org.akai.sg_akai.ui.theme.Green300


@Composable
fun NiceButton(text: String, onClick: () -> Unit = {}){
    Button(
        onClick = onClick,
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
                text,
                color = Color.White
            )
        }
    }
}