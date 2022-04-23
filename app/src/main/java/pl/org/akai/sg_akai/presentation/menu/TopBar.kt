package pl.org.akai.sg_akai.presentation.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.poznan.put.michalxpz.core_ui.LocalSpacing

@Composable
fun TopBar(
    showTopBar: Boolean,
    onBackArrowClicked: () -> Unit,
    onHomeIconClicked: () -> Unit,
    onCalendarIconClicked: () -> Unit
) {
    if (showTopBar) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.onSecondary.copy(alpha = 0.80f))

        ) {
            IconButton(
                onClick = { onBackArrowClicked() },
                modifier = Modifier
                    .align(Alignment.CenterStart)
            ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "")
            }

            Spacer(modifier = Modifier.width(LocalSpacing.current.extraLarge))
            IconButton(
                onClick = { onHomeIconClicked() },
                modifier = Modifier.align(Alignment.Center)
            ) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(LocalSpacing.current.extraLarge))
            IconButton(
                onClick = { onCalendarIconClicked() },
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Icon(
                    Icons.Filled.DateRange,
                    contentDescription = null
                )
            }
        }
    }
}