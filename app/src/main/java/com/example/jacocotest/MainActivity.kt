package com.example.jacocotest

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
import com.example.jacocotest.viewmodel.MainActivityViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val value = MainActivityViewModel.plus(1, 2)
        val valueMultiple = MainActivityViewModel.multiple(2, 2)
        setContent {
         //   JacocoTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting(name = "Android", value = value, valueMultiple = valueMultiple)
                }
          //  }
        }
    }
}

@Composable
fun Greeting(name: String, value: Int, valueMultiple: Int, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! $value $valueMultiple",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   // JacocoTestTheme {
        Greeting("Android", 4, 6)
   // }
}
