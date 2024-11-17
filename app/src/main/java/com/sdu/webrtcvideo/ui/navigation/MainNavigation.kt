package com.sdu.webrtcvideo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codewithkael.localvideocall.utils.Constants.HOST_SCREEN
import com.codewithkael.localvideocall.utils.Constants.MAIN_SCREEN
import com.sdu.webrtcvideo.ui.screen.ClientScreen
import com.sdu.webrtcvideo.ui.screen.HostScreen
import com.sdu.webrtcvideo.ui.screen.MainScreen


@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MAIN_SCREEN) {
        composable(MAIN_SCREEN){
            MainScreen(navController = navController)
        }
        composable(HOST_SCREEN){
            HostScreen(navController = navController)
        }
        composable("ClientScreen",
        ) {
            ClientScreen(
                navController = navController,
            )
        }


    }

}