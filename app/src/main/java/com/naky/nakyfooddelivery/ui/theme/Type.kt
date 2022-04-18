package com.naky.nakyfooddelivery.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.naky.nakyfooddelivery.R

val fonts =
    FontFamily(
        Font(R.font.sf_pro_rounded_bold,FontWeight.Bold),
        Font(R.font.sf_pro_rounded_black,FontWeight.Black),
        Font(R.font.sf_pro_rounded_heavy, FontWeight.ExtraBold),
        Font(R.font.sf_pro_rounded_ultralight, FontWeight.ExtraLight),
        Font(R.font.sf_pro_rounded_light,FontWeight.Light),
        Font(R.font.sf_pro_rounded_medium,FontWeight.Medium),
        Font(R.font.sf_pro_rounded_regular,FontWeight.Normal),
        Font(R.font.sf_pro_rounded_semibold,FontWeight.SemiBold),
        Font(R.font.sf_pro_rounded_thin, FontWeight.Thin),
    )
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W500,
        fontSize = 30.sp,
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp,
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W500,
        fontSize = 20.sp,
    ),
    h4 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W400,
        fontSize = 18.sp,
    ),
    h5 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
    ),
    h6 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    )
)