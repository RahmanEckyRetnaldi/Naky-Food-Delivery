package com.naky.nakyfooddelivery.ui.page.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naky.nakyfooddelivery.R
import com.naky.nakyfooddelivery.ui.theme.NakyFoodDeliveryTheme


@Composable
fun PageSplashSccreen(
    modifier: Modifier = Modifier
) {
    ScreenSplashScreen()
}


@Composable
fun ScreenSplashScreen(
    modifier: Modifier = Modifier
) {
    val ctx = LocalContext.current
    val currentWidth = ctx.resources.displayMetrics.widthPixels.dp / LocalDensity.current.density
    val currentHeight = ctx.resources.displayMetrics.heightPixels.dp / LocalDensity.current.density
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = MaterialTheme.colors.secondary)
            .padding(vertical = currentHeight / 12f)
            .verticalScroll(scrollState)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = currentWidth / 10f),
            verticalArrangement = Arrangement.spacedBy(currentHeight/50f)
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = modifier
                        .size(73.dp)
                        .background(color = Color.White, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logofood),
                        contentDescription = "logo",
                        modifier = modifier
                            .width(45.86.dp)
                            .height(49.65.dp)
                    )
                }
            }
            Column() {
                Text(
                    text = "Naky \nFood for Everyone",
                    style = MaterialTheme.typography.body1.copy(
                        fontSize = 65.sp,
                        lineHeight = 56.44.sp,
                        fontWeight = FontWeight(800),
                        letterSpacing = -(65f*3f/100f).sp,
                        color = Color.White
                    )
                )
            }

        }

        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.peoplesplash),
                    contentDescription = "",
                    modifier = modifier
                        .fillMaxWidth()
                        .height(currentHeight / 2.5f)
                )
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(currentHeight / 2.5f),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Box(
                        modifier = modifier
                            .fillMaxWidth()
                            .height((currentHeight / 2.5f) / 3f)
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(

                                        MaterialTheme.colors.secondary.copy(0.1f),
                                        MaterialTheme.colors.secondary,

                                        )
                                )
                            )
                    ) {

                    }
                }

            }

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = currentWidth / 10f),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color.White
                    ),

                    ) {
                    Text(
                        text = "Get Starteed",
                        style = MaterialTheme.typography.body1.copy(
                            fontSize = 17.sp,
                            lineHeight = 20.29.sp,
                            fontWeight = FontWeight(800),
                            letterSpacing = 0.sp,
                            color = MaterialTheme.colors.secondary
                        )
                    )
                }
            }

        }



    }
}

@Preview
@Composable
fun PreviewScreenSplashScreen() {
    NakyFoodDeliveryTheme {
        ScreenSplashScreen()
    }
}