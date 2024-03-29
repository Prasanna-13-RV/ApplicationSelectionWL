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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.components.WorldlineLogo
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
fun SelectionScreen(navController: NavController) {
    val selectedApplication = remember { mutableStateOf(dummy[0]) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                GreenWL
            )
            .padding(20.dp)
    ) {
        WorldlineLogo()
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
                        Text(text = stringResource(id = R.string.payment), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "00", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text =  stringResource(id = R.string.select_an_application),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn {
                    items(dummy) { application ->
                        EachApplication(
                            application,
                            selectedApplication.value.applicationName
                        ) {
                            selectedApplication.value =
                                dummy.find { it.applicationName == application.applicationName }!!
                        }
                    }
                }
            }

            BottomButtons(selectedApplication.value, navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectionScreenPreview() {
    ApplicationSelectionWLTheme {
        SelectionScreen(rememberNavController())
    }
}

