package `in`.shrifoods.app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import `in`.shrifoods.app.components.ProductCard
import `in`.shrifoods.app.viewmodel.ProductViewModel

@Composable
fun HomeScreen(
    viewModel: ProductViewModel = viewModel()
) {

    if (viewModel.products.isEmpty()) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Text("Loading Products...")
        }

    } else {

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            items(viewModel.products) { item ->

                ProductCard(item)
            }
        }
    }
}