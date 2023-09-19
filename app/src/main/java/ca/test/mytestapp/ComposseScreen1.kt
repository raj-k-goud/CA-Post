package ca.test.mytestapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import ca.test.mytestapp.data.User
import ca.test.mytestapp.ui.theme.Typography
import ca.test.mytestapp.utils.Constants.KEY
import ca.test.mytestapp.utils.Constants.SCREEN_2

@Composable
fun ComposeScreen1(navController: NavHostController, navBackStackEntry: NavBackStackEntry) {

    val user = navBackStackEntry.savedStateHandle.get<User>(KEY)?: null

    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center
    ) {
        user?.let {
            Text(
                text = "Hello, " +it.firstName +" " +it.lastName,
                modifier = Modifier
                    .padding(18.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = Typography.displaySmall
            )
        }
        if(user == null){
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp), onClick = {
                navController.navigate(SCREEN_2)
            }) {
                Text(text = "Introduce Yourself")
            }
        }

    }

}