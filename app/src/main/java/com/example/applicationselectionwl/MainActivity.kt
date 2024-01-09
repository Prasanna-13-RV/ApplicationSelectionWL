package com.example.applicationselectionwl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.applicationselectionwl.ui.screens.AbortScreen
import com.example.applicationselectionwl.ui.screens.SelectionScreen
import com.example.applicationselectionwl.ui.screens.WaitScreen
import com.example.applicationselectionwl.ui.theme.ApplicationSelectionWLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationSelectionWLTheme {
                val navController = rememberNavController()

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Box(modifier = Modifier.fillMaxWidth()) {
                        NavHost(
                            navController = navController,
                            startDestination = "waitScreen",

                            ) {

                            //post


                            composable(route ="selectionScreen") {
                                SelectionScreen()
                            }
                            composable(route = "waitScreen") {
                                WaitScreen()
                            }
                            composable(route = "abortScreen") {
                                AbortScreen()
                            }

                        }
                    }

                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplicationSelectionWLTheme {
        Greeting("Android")
    }
}