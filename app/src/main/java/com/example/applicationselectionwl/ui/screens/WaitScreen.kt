package com.example.applicationselectionwl.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun WaitScreen() {

    Column(
        
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)

    ) {


        Text(text = "Worldline",

            color = Color.White,
            modifier = Modifier.padding(top = 5.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Text(text = "Please wait")



    }
}