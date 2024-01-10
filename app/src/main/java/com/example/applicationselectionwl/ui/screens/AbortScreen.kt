package com.example.applicationselectionwl.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.ui.components.WorldlineLogo
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL


@Composable
fun AbortScreen() {
    Column(
        Modifier
            .background(color = GreenWL)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        WorldlineLogo()
        Column(
            Modifier
                .padding(20.dp),
        ) {
            Column(
                Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier) {
                    Text(
                        modifier = Modifier,
                        text = "120.95",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        modifier = Modifier,
                        text = "EUR",
                        fontSize = 30.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(R.string.declined),
                    fontSize = 30.sp,
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(R.string.transaction_aborted),
                    fontSize = 25.sp,
                )
                Spacer(modifier = Modifier.height(25.dp))
                Image(
                    painter = painterResource(R.drawable.cross_logo),
                    contentDescription = "Declined",
                    modifier = Modifier
                        .width(200.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AbortScreenPreview() {
    ApplicationSelectionWLTheme {
        AbortScreen()
    }
}