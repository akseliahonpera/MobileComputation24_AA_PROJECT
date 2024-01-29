package com.example.mobilecomputation24_aa_project.ui

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.mobilecomputation24_aa_project.R

@Composable
fun home(
    navController:NavController
) {

    Text(
        text = "Hei, tervetuloa kotivalikkoon!", fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(20.dp)
                .horizontalScroll(rememberScrollState())
        )
        {

           var counter by remember { mutableStateOf(0)}


            Button(onClick = {counter++ }
            ) {
                Text(text = " No. $counter")
            }

            Spacer(modifier = Modifier.height(10.dp))
            
            
            Button(onClick = { navController.navigate("profile") }) {
                Text(text = "Profile")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Teksti 2")
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            modifier = Modifier
                .size(300.dp),
            painter = painterResource(R.drawable.placeholder_image),
            contentDescription = "Random image"
        )

        Spacer(modifier = Modifier.height(10.dp))
        Image(
            modifier = Modifier
                .size(300.dp),
            painter = painterResource(R.drawable.placeholder_image),
            contentDescription = "Random image"
        )

        Spacer(modifier = Modifier.height(10.dp))
        Image(
            modifier = Modifier
                .size(300.dp),
            painter = painterResource(R.drawable.placeholder_image),
            contentDescription = "Random image"
        )
    }

}
