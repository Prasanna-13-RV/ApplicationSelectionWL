package com.example.applicationselectionwl.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.components.selectionScreenComponents.BottomButtons
import com.example.applicationselectionwl.ui.components.selectionScreenComponents.EachApplication
import com.example.applicationselectionwl.ui.theme.Abort
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL


var dummy: List<ApplicationModel> = listOf(
    ApplicationModel(1, "Visa", R.drawable.visa),
    ApplicationModel(1, "Mastercard", R.drawable.mastercard)
)

@Composable
fun SelectionScreen() {
    val selectedApplication = remember { mutableStateOf("Visa") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                GreenWL
            )
            .padding(20.dp)
    ) {
        Text(text = "Worldline", color = Color.White, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .padding(20.dp)
                .fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {

                Column {

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Payment", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "00", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Select an application",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn {
                    items(dummy) {
                        EachApplication(it,selectedApplication.value,)
                    }
                }
            }

           BottomButtons()
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

