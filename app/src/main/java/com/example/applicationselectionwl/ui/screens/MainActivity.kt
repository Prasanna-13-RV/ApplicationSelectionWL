package com.example.applicationselectionwl.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.applicationselectionwl.data.dataClasses.ApplicationModel
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationSelectionWLTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    Box(modifier = Modifier.fillMaxWidth()) {
                        NavHost(
                            navController = navController,
                            startDestination = "waitScreen",

                            ) {
                            composable(route = "SelectionScreen") {
                                SelectionScreen()
                            }
                            composable(
                                route = "WaitScreen/{applicationModel}",
                                arguments = listOf(navArgument("applicationModel") {
                                    type = NavType.ParcelableType(ApplicationModel::class.java)
                                })
                            ) { backStackEntry ->
                                val application =
                                    backStackEntry.arguments?.getParcelable<ApplicationModel>("applicationModel")

                                WaitScreen(data = application!!)

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
