package com.example.mytag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytag.ui.theme.MyTagTheme
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /** val db = Firebase.firestore
            val database = Firebase.database
            val myRef = database.getReference("message")**/
            MyApp {
                Maps()
                MenuButton()
                TagsMenuButton()
                FindYourselfIcon()
            }
        }
    }
}

//
//
@Composable
fun MyApp(content: @Composable () -> Unit){
// MyApplicationTheme(){
//      //A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//
// }
}

@Composable
fun Maps(modifier: Modifier = Modifier){
    modifier.fillMaxSize()
}

@Composable
fun MenuButton(){

}

@Composable
fun TagsMenuButton(){
}

@Composable
fun FindYourselfIcon(){

}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        Greeting("Android")
    }
}