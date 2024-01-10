package com.example.applicationselectionwl.ui.components.selectionScreenComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applicationselectionwl.R
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL

@Composable
fun EachApplication(
    application: ApplicationModel,
    selectedApplication: String,
    setSelectedApplication: () -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                setSelectedApplication()
            }
            .then(
                if (selectedApplication == application.applicationName) {
                    Modifier
                        .border(
                            border = BorderStroke(3.dp, GreenWL),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .background(
                            GreenWL.copy(alpha = 0.2f), shape = RoundedCornerShape(10.dp)
                        )
                } else {
                    Modifier
                }
            )
    ) {
        RadioButton(
            selected = selectedApplication == application.applicationName,
            onClick = {
                setSelectedApplication()
            })
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
        EachApplication(ApplicationModel(0, "Visa", R.drawable.visa), "Visa") {}
    }
}