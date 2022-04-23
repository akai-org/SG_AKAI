package pl.org.akai.sg_akai.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import pl.org.akai.sg_akai.R

val poppins = FontFamily(
    Font(R.font.poppinsblack),
    Font(R.font.poppinsbold),
    Font(R.font.poppinslight),
    Font(R.font.poppinsextrabold),
    Font(R.font.poppinsmedium),
)

val SmartGardenTypography = Typography(

    h1 =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 96.sp
    ),
    h2 =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 60.sp
    ),
    h3 =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 48.sp
    ),
    h4 =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 34.sp
    ),
    h5 =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 16.sp
    ),
    button =TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Black,
        fontSize = 14.sp
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
