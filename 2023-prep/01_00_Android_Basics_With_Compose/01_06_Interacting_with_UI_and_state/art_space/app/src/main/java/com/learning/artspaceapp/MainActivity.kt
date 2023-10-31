package com.learning.artspaceapp

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpacePreview()
                }
            }
        }
    }
}

@Composable
fun ImageCard(photoResource: Int, modifier: Modifier = Modifier) {
    var resourceImage = when (photoResource) {
        1 -> R.drawable._a306e_png_text_first_example
        2 -> R.drawable.db3e33_png_text_second_example
        3 -> R.drawable.db3e33_png_text_third_example
        4 -> R.drawable._4fc00_png_text_fourth_example
        else -> R.drawable.edd57d_png_text_fifth_example
    }
    var resourceText = when (photoResource) {
        1 -> R.string.first_photo_content_description
        2 -> R.string.second_photo_content_description
        3 -> R.string.third_photo_content_description
        4 -> R.string.fourth_photo_content_description
        else -> R.string.fifth_photo_content_description
    }
    Image(
        painterResource(id = resourceImage),
        contentDescription = stringResource(id = resourceText),
        modifier = modifier
    )
}

@Composable
fun ImageDescription(currentResource: Int, modifier: Modifier = Modifier){
    var resourceText = when (currentResource) {
        1 -> R.string.first_photo_description
        2 -> R.string.second_photo_description
        3 -> R.string.third_photo_description
        4 -> R.string.fourth_photo_description
        else -> R.string.fifth_photo_description
    }
    Text(text = stringResource(id = resourceText), style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif, color = Color.Cyan))
}


@Composable
fun MainPage(modifier: Modifier = Modifier) {
    var currentState by remember {
        mutableStateOf(1)
    }
    Column(modifier = modifier
        .wrapContentSize(align = Alignment.TopCenter)
        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        ImageCard(photoResource = currentState)
        Spacer(modifier = modifier.height(8.dp))
        ImageDescription(currentResource = currentState)
        Spacer(modifier = modifier.height(18.dp))
        Row(modifier, Arrangement.SpaceEvenly) {
            Box(
                modifier = Modifier
                    .border(width = 4.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {

                    --currentState
                    if (currentState < 1) {
                        currentState = 5
                    }
                }) {
                    Text(text = stringResource(id = R.string.previous_button))

                }
            }
            Box(
                modifier = Modifier
                    .border(width = 4.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {
                    ++currentState
                    if (currentState > 5) {
                        currentState = 1
                    }
                }, modifier) {
                    Text(text = stringResource(id = R.string.next_button))
                }
            }

        }

    }
}

@Preview
@Composable
fun ArtSpacePreview() {
    ArtSpaceAppTheme {
        MainPage(
            Modifier

        )
    }
}