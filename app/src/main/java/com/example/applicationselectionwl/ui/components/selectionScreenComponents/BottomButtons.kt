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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.screens.SelectionScreen
import com.example.applicationselectionwl.ui.theme.Abort
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL

@Composable
fun BottomButtons(selectedApplication: ApplicationModel, navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {
                navController.currentBackStackEntry?.savedStateHandle?.set("applicationModel", selectedApplication)
                navController.navigate("WaitScreen")

            },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), colors = ButtonDefaults.buttonColors(Abort)
        ) {
            Text(text = "Abort", color = Color.White)
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = {
                navController.navigate("WaitScreen/$selectedApplication")
            },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), colors = ButtonDefaults.buttonColors(GreenWL)
        ) {
            Text(text = "Complete", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomButtonsPreview() {
    ApplicationSelectionWLTheme {
        BottomButtons(ApplicationModel(0, "Visa", R.drawable.visa), rememberNavController())
    }
}