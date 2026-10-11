package ca.gbc.comp3074.diamantino_nicole.restaurantguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens.AddEditRestaurantScreen
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.theme.RestaurantGuideTheme



class FormTestActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RestaurantGuideTheme {
                AddEditRestaurantScreen()
            }
        }
    }
}
