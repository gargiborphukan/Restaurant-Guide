package ca.gbc.comp3074.diamantino_nicole.restaurantguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Box
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens.HomeScreen
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Box
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens.HomeScreen
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens.RestaurantDetailsScreen
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.theme.RestaurantGuideTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

            setContent {
                RestaurantGuideTheme {

                    var currentScreen by remember {
                        mutableStateOf("home")
                    }

                    Scaffold(
                        modifier = Modifier.fillMaxSize()
                    ) { innerPadding ->

                        Box(
                            modifier = Modifier.padding(innerPadding)
                        ) {var selectedRestaurant by remember {
                            mutableStateOf("Bella Italia")
                        }
                            when (currentScreen) {
                                "home" -> HomeScreen(
                                    onRestaurantClick = { restaurantName ->
                                        selectedRestaurant = restaurantName
                                        currentScreen = "details"
                                    }
                                )

                                "details" -> RestaurantDetailsScreen(
                                    restaurantName = selectedRestaurant,
                                    onBackClick = {
                                        currentScreen = "home"
                                    }
                                )
                            }
                        }
                    }
                }
            }
    }
}
