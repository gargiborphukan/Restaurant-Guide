package ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ca.gbc.comp3074.diamantino_nicole.restaurantguide.ui.screens.AboutScreen



@Composable //annotation used to identify fun that describes the applications user interface
fun AboutScreen(onBack: () -> Unit){
    Column( //arranges components vertically-top to bottom
        modifier = Modifier //controls size,spacing,alignment
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text( //displays words
            text = "Restaurant Guide",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Your personal guide to restaurants you love!",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "About Us",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(24.dp))

        TeamMember("Nicole Diamantino")
        HorizontalDivider()

        TeamMember("Vera Brazao")
        HorizontalDivider()

        TeamMember("Gargi Borphukan")
        HorizontalDivider()

        Spacer(modifier = Modifier.height(24.dp))

        //button provides a back action
        Button(onClick = onBack) { //button creates clickable button that performs an action
            Text(text = "Back")
        }

    }
}
@Composable
//RestaurantListItem builds a reusable row for each iyem
fun TeamMember(name : String) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(
            text = name,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )
    }
}
