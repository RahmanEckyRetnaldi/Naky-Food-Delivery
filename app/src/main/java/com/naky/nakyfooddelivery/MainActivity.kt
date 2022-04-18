package com.naky.nakyfooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.naky.nakyfooddelivery.ui.page.auth.PageSplashSccreen
import com.naky.nakyfooddelivery.ui.theme.NakyFoodDeliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NakyFoodDeliveryTheme {
                // A surface container using the 'background' color from the theme
                PageSplashSccreen()
            }
        }
    }
}

