package com.example.applicationselectionwl.ui.screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.applicationselectionwl.ui.components.EachApplication
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme


@Composable
fun SelectionScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Worldline")
        Column {
            EachApplication()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectionScreenPreview() {
    ApplicationSelectionWLTheme {
        SelectionScreen()
    }
}