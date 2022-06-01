package com.example.mytag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytag.ui.theme.MyTagTheme
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.maps.android.compose.GoogleMap

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Maps()
            MenuButton()
            TagsMenuButton()
            FindYourselfIcon()
        }
    }
}

@Composable
fun Maps(modifier: Modifier = Modifier){
    modifier.fillMaxSize()
    GoogleMap(
        Modifier.fillMaxSize()
    )
}

@Composable
fun MenuButton(){

    FloatingActionButton(
        onClick = { /*TODO*/ },
        backgroundColor = Color.Red,
        content = {
            Icon(
                painter = painterResource(id = R.drawable.my_icon),
                contentDescription = null,
                tint = Color.White
            )
        }
    )
}

@Composable
fun TagsMenuButton(){
    FloatingActionButton(
        onClick = { /*TODO*/ },
        backgroundColor = Color.Red,
        content = {
            Icon(
                painter = painterResource(id = R.drawable.my_icon),
                contentDescription = null,
                tint = Color.White
            )
        }
    )
}

@Composable
fun FindYourselfIcon(){
    FloatingActionButton(
        onClick = { /*TODO*/ },
        backgroundColor = Color.Red,
        content = {
            Icon(
                painter = painterResource(id = R.drawable.my_icon),
                contentDescription = null,
                tint = Color.White
            )
        }
    )

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Maps()
}