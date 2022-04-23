package pl.org.akai.sg_akai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import dagger.hilt.android.AndroidEntryPoint
import pl.org.akai.sg_akai.ui.theme.SmartGardenTheme

@AndroidEntryPoint`
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setcontent view for xml ui
//        setContentView(R.layout.activity_main)

        //set content for compose ui
        setContent {
            SmartGardenTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MyButton(
                       "Hello",
                       {}
                   )
                }
            }
        }
    }
}

@Composable
fun MyButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.button,
) {

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(LocalSpacing.current.small)
        )
    }
}