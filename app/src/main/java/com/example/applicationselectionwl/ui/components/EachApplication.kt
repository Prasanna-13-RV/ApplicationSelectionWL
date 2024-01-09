package com.example.applicationselectionwl.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.ui.screens.SelectionScreen
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme

@Composable
fun EachApplication() {
    Row {
        Image(
            painter = painterResource(R.drawable.mastercard),
            contentDescription = "mastercard",
            modifier = Modifier.width(20.dp)
        )
        Text("Mastercard")
    }
}


@Preview(showBackground = true)
@Composable
fun SelectionScreenPreview() {
    ApplicationSelectionWLTheme {
        EachApplication()
    }
}