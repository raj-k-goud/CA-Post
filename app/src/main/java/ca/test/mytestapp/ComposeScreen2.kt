package ca.test.mytestapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ca.test.mytestapp.data.User


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeScreen2(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center
    ) {
        var firstName by remember { mutableStateOf("") }
        var lastName by remember { mutableStateOf("") }
        Text(text = "First Name", modifier = Modifier.padding(12.dp))

        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        )

        Text(text = "Last Name", modifier = Modifier.padding(12.dp))

        OutlinedTextField(
            value = lastName,
            onValueChange = { lastName = it },
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        )

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp), onClick = {
            navController.previousBackStackEntry?.savedStateHandle?.set(
                "key1", User(firstName, lastName)
            )
            navController.popBackStack()
        }) {
            Text(text = "Save")
        }
    }
}