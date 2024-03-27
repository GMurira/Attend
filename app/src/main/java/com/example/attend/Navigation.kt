package com.example.attend

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.attend.ui.theme.screens.HomeScreen
import com.example.attend.ui.theme.screens.SettingsScreen

/**
 * Enum class define the finite number or routes
 */
enum class Screens(){
    HomeScreen,
    Settings
}
@Composable
fun Navigation(
    navController: NavHostController =  rememberNavController(),

){
    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.name,
        modifier = Modifier.fillMaxSize()
    ){
        composable(route = Screens.HomeScreen.name){
            HomeScreen(onSettingsButtonClicked = {
                navController.navigate(Screens.Settings.name)
            })
        }
        composable(route = Screens.Settings.name ){
            SettingsScreen()
        }
    }
}