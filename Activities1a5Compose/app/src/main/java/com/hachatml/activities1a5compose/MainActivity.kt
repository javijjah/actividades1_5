package com.hachatml.activities1a5compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hachatml.activities1a5compose.screens.Actividad1
import com.hachatml.activities1a5compose.screens.Actividad2
import com.hachatml.activities1a5compose.screens.Actividad3
import com.hachatml.activities1a5compose.screens.Actividad4
import com.hachatml.activities1a5compose.screens.Actividad5
import com.hachatml.activities1a5compose.ui.theme.Activities1a5ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activities1a5ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
Actividad5()
                }
            }
        }
    }
}
/*
Actividad 4:
Sitúa el TextField en el centro de la pantalla y haz que reemplace el valor de una coma por un punto
y que no deje escribir más de un punto decimal...
*/
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
    Activities1a5ComposeTheme {
        Greeting("Android")
    }
}