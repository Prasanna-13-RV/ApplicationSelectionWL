package com.example.applicationselectionwl.ui.components.selectionScreenComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme

@Composable
fun EachApplication(application: ApplicationModel, selectedApplication: String) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selectedApplication == application.applicationName,
            onClick = { /*TODO*/ })
        Image(
            painter = painterResource(application.image),
            contentDescription = application.applicationName,
            modifier = Modifier.width(50.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(application.applicationName)
    }
}


@Preview(showBackground = true)
@Composable
fun SelectionScreenPreview() {
    ApplicationSelectionWLTheme {
        EachApplication(ApplicationModel(0, "Visa", R.drawable.visa),"Visa")
    }
}