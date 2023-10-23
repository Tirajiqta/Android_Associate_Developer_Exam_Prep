package com.example.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Happy Birthday Sam!", from = "From Emma")
                }
            }
        }
    }
}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)

        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.max_dripin),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BirthdayAppTheme {
        GreetingImage(message = "Happy Birthday Sam!", from = " From me")

    }
}


/* NOTES
Jetpack Compose is a modern toolkit for building Android UIs.
Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin capabilities.
With Compose, you can build your UI by defining a set of functions, called composable functions, that take in data and describe UI elements.
Composable functions are the basic building block of a UI in Compose. A composable function:

    Describes some part of your UI.
    Doesn't return anything.
    Takes some input and generates what's shown on the screen.
Annotations are means of attaching extra information to code. This information helps tools like the Jetpack Compose compiler, and other developers understand the app's code.

An annotation is applied by prefixing its name (the annotation) with the @ character at the beginning of the declaration you are annotating.
Different code elements, including properties, functions, and classes, can be annotated

Jetpack Compose is built around composable functions.
These functions let you define your app's UI programmatically by describing how it should look, rather than focusing on the process of the UI's construction.
To create a composable function, just add the @Composable annotation to the function name.
Composable functions can accept arguments, which let the app logic describe or modify the UI.
In this case, your UI element accepts a String so that it can greet the user by name.

 */