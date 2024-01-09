package com.example.applicationselectionwl.ui.components.selectionScreenComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.ui.screens.SelectionScreen
import com.example.applicationselectionwl.ui.theme.Abort
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL

@Composable
fun BottomButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), colors = ButtonDefaults.buttonColors(Abort)
        ) {
            Text(text = "Abort", color = Color.White)
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), colors = ButtonDefaults.buttonColors(GreenWL)
        ) {
            Text(text = "Complete", color = Color.White)
            Image(painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24), contentDescription ="Continue", )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomButtonsPreview() {
    ApplicationSelectionWLTheme {
        BottomButtons()
    }
}