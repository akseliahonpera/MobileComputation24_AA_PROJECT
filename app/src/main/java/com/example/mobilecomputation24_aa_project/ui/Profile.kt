package com.example.mobilecomputation24_aa_project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavOptions


@Composable
fun profileScreen(navController:NavController

    ){

    val placeholder1 = remember { mutableStateOf("") }   //Setting  val
    val placeholder2 = remember { mutableStateOf("") }   //Setting  val
    val placeholder3 = remember { mutableStateOf("") }   //Setting  val
    val placeholder4 = remember { mutableStateOf("") }   //Setting  val
    
    Column (
        verticalArrangement = Arrangement.spacedBy(10.dp)

    ){




        Button(onClick = {

            navController.navigate("home") {
                popUpTo("home"){
                    inclusive = true
                }
            }

        }) {

            Text(text = "Kotiin")
        }
        
        Text(text = "My profile")
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder1.value,
            onValueChange = {text -> placeholder1.value = text},
            label = { androidx.compose.material.Text(text = "placeholder1") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder2.value,
            onValueChange = {text -> placeholder2.value = text},
            label = { androidx.compose.material.Text(text = "placeholder2") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder3.value,
            onValueChange = {text -> placeholder3.value = text},
            label = { androidx.compose.material.Text(text = "placeholder3") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder4.value,
            onValueChange = {text -> placeholder4.value = text},
            label = { androidx.compose.material.Text(text = "placeholder4") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
    }
=======
package com.example.mobilecomputation24_aa_project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavOptions


@Composable
fun profileScreen(navController:NavController

    ){

    val placeholder1 = remember { mutableStateOf("") }   //Setting  val
    val placeholder2 = remember { mutableStateOf("") }   //Setting  val
    val placeholder3 = remember { mutableStateOf("") }   //Setting  val
    val placeholder4 = remember { mutableStateOf("") }   //Setting  val
    
    Column (
        verticalArrangement = Arrangement.spacedBy(10.dp)

    ){




        Button(onClick = {

            navController.navigate("home") {
                popUpTo("home"){
                    inclusive = true
                }
            }

        }) {

            Text(text = "Kotiin")
        }
        
        Text(text = "My profile")
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder1.value,
            onValueChange = {text -> placeholder1.value = text},
            label = { androidx.compose.material.Text(text = "placeholder1") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder2.value,
            onValueChange = {text -> placeholder2.value = text},
            label = { androidx.compose.material.Text(text = "placeholder2") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder3.value,
            onValueChange = {text -> placeholder3.value = text},
            label = { androidx.compose.material.Text(text = "placeholder3") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
        OutlinedTextField(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            value = placeholder4.value,
            onValueChange = {text -> placeholder4.value = text},
            label = { androidx.compose.material.Text(text = "placeholder4") },
            shape = RoundedCornerShape(corner = CornerSize(45.dp))
        )
    }
>>>>>>> 3458e8484d15b869aa66dfd7749154a7af2aae57
}
