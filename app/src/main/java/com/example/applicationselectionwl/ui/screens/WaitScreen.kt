package com.example.applicationselectionwl.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.theme.GreenWL
import kotlinx.coroutines.delay


@Composable
fun WaitScreen(data: ApplicationModel) {
    var showContent by remember { mutableStateOf(false) }
    val strokeWidth = 5.dp


    LaunchedEffect(Unit) {
        delay(3000)
        showContent = true
    }


    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(GreenWL)

    ) {


        Image(
            painter = painterResource(R.drawable.worldline_logo),
            contentDescription = stringResource(id = R.string.worldline),
            modifier = Modifier
                .width(200.dp)
                .padding(top = 30.dp),
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxSize()
        ) {

            if (showContent) {
                Text(text = "Master card", color = Color.White)
            } else {
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
}