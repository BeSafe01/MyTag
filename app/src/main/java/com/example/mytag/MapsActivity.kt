package com.example.mytag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytag.ui.theme.MyTagTheme
import com.google.maps.android.compose.*
import com.google.type.LatLng

class MapsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTagTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
MyGoogleMaps()
                }
            }
        }
    }
}

@Composable
fun MyGoogleMaps(){
    //MArker
    //val marker = LatLng(28.278833,-16.63916)
    val properties by remember {
        mutableStateOf(MapProperties(mapType = MapType.HYBRID))//Muda o mapa)
    }

    val uiSettings by remember {
        mutableStateOf(MapUiSettings(zoomControlsEnabled = false))
    }

    GoogleMap(modifier = Modifier.fillMaxSize(),
     properties = properties,
    uiSettings = uiSettings
    )
    //Marker(position = marker, title = "MyTag", snippet = "Tem algo escrito")
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyTagTheme {
        Greeting2("Android")
    }
}