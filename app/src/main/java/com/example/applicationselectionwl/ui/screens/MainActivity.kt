package com.example.applicationselectionwl.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.*

import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme
import com.example.applicationselectionwl.ui.theme.GreenWL

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationSelectionWLTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenWL
                ) {

                    Column(modifier = Modifier.fillMaxWidth()) {
                        NavHost(
                            navController = navController,
                            startDestination = "SelectionScreen",
                        ) {
                            composable(route = "SelectionScreen") {
                                SelectionScreen()
                            }
                            composable(route = "WaitScreen") {
                                WaitScreen()
                            }
                            composable(route = "AbortScreen") {
                                AbortScreen()
                            }

                        }
                    }
                }
            }
        }
    }
}
