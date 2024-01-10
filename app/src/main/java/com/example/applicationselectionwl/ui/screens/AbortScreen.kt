package com.example.applicationselectionwl.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationselectionwl.R
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
        Image(
            painter = painterResource(R.drawable.worldline_logo),
            contentDescription = "Worldline",
            modifier = Modifier
                .width(200.dp)
                .padding(top = 30.dp),
        )
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
                Row(modifier = Modifier.padding(10.dp)) {
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
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.declined),
                    fontSize = 30.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = stringResource(R.string.transaction_aborted),
                    fontSize = 25.sp,
                )
                Image(
                    painter = painterResource(R.drawable.cross_logo),
                    contentDescription = "Declined",
                    modifier = Modifier
                        .width(200.dp)
                        .padding(top = 30.dp),
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