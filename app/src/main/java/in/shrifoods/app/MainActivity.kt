package `in`.shrifoods.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import `in`.shrifoods.app.screens.HomeScreen
import `in`.shrifoods.app.screens.SplashScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var showSplash by remember {
                mutableStateOf(true)
            }

            if (showSplash) {

                SplashScreen(
                    onNavigate = {
                        showSplash = false
                    }
                )

            } else {

                HomeScreen()

            }
        }
    }
}