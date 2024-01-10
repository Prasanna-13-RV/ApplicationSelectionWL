package com.example.applicationselectionwl.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R


@Composable
fun WorldlineLogo() {
    Image(
        painter = painterResource(R.drawable.worldline_logo),
        contentDescription = "Worldline",
        modifier = Modifier
            .width(200.dp)
    )
}