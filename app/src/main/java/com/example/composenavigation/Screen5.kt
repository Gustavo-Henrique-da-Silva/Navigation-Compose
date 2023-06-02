package com.example.composenavigation.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.composenavigation.Destination

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Screen5(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "5º Tela") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Tela 5")
            Button(onClick = {navController.navigate(Destination.ScreenFirst.route)}) {
                Text(text = "Próxima")
            }
            Button(onClick = {navController.navigateUp()}) {
                Text(text = "Anterior")
            }
        }
    }
}