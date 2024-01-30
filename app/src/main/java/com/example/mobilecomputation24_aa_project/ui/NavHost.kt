package com.example.mobilecomputation24_aa_project.ui

import android.provider.ContactsContract
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class NavHost(
    val navController: NavHostController
){
    fun navigateBack(){
        navController.popBackStack()
    }
}

@Composable
fun rememberAppState(
navController: NavHostController = rememberNavController()
)=remember(navController){
    NavHost(navController)
}

/*
@Composable
fun backHandler(){
    BackHandler {
        enabled = true, onBack = {
            navigateBack()
    }
    }
}

=======
package com.example.mobilecomputation24_aa_project.ui

import android.provider.ContactsContract
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class NavHost(
    val navController: NavHostController
){
    fun navigateBack(){
        navController.popBackStack()
    }
}

@Composable
fun rememberAppState(
navController: NavHostController = rememberNavController()
)=remember(navController){
    NavHost(navController)
}

/*
@Composable
fun backHandler(){
    BackHandler {
        enabled = true, onBack = {
            navigateBack()
    }
    }
}

>>>>>>> 3458e8484d15b869aa66dfd7749154a7af2aae57
 */
