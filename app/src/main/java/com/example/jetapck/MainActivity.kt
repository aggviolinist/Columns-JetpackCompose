package com.example.jetapck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetapck.ui.theme.JetapckTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {  //how to call composable
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) { //We replaced this normal column with a scrollable column
                Image(
                    painter = painterResource( //argument name and what the argument is
                        id = R.drawable.welcome),
                    contentDescription = "That's a good sign",
                    modifier = Modifier.height(300.dp),

                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) { //for this padding we don't want the text to start at the edge
                    Text(
                        text = "Welcome to Jetpack:)",
                        style = TextStyle(//style is a modifier, There are a bunch of parameters that this TextStyle takes
                        fontSize = 20.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Learning jetpack", fontSize = 17.sp)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Its fun doing this", color = Color.Green,fontSize = 15.sp)


                }
                Column(modifier = Modifier.padding(16.dp)) {
                    Button(onClick = {}) {
                        Text(text = "Click me")

                    }


                }
            }

        Spacer(modifier = Modifier.padding(16.dp))
            


        }



    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetapckTheme {
        Greeting("Android")
    }
}