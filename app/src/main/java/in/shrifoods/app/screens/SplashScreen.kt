package `in`.shrifoods.app.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigate: () -> Unit
) {

    LaunchedEffect(Unit) {
        delay(2500)
        onNavigate()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF6B00),
                        Color(0xFFFFA726)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Box(
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "SF",
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFF6B00)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Shri Foods",
                color = Color.White,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Fresh • Fast • Delicious",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}