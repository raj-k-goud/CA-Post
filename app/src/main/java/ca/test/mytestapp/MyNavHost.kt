package ca.test.mytestapp

import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ca.test.mytestapp.utils.Constants.SCREEN_1
import ca.test.mytestapp.utils.Constants.SCREEN_2


@Composable
fun MyNavHost(navHostController: NavHostController, owner: LifecycleOwner) {

    NavHost(navController = navHostController, startDestination = "screen1") {

        composable(route = SCREEN_1)
        {
            ComposeScreen1(navHostController, it)
        }

        composable(route = SCREEN_2)
        {
            ComposeScreen2(navHostController)
        }
    }
}
