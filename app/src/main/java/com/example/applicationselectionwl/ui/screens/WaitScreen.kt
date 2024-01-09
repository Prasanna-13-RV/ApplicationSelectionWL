package com.example.applicationselectionwl.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.ui.theme.GreenWL


@Composable
fun WaitScreen() {
    val strokeWidth = 5.dp


    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(GreenWL)

    ) {


        Text(
            text = stringResource(id = R.string.worldline),

            color = Color.White,
            modifier = Modifier.padding(top = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxSize()
        ) {
            CircularProgressIndicator(
                modifier = Modifier.size(120.dp),
                color = Color.White,
                strokeWidth = strokeWidth
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = stringResource(id = R.string.wait), color = Color.White)
        }


    }
}