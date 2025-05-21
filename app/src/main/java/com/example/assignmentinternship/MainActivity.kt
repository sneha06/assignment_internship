package com.example.assignmentinternship

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignmentinternship.presentation.Screen.ProfileScreen
import com.example.assignmentinternship.presentation.Screen.ProfileViewModel
import com.example.assignmentinternship.ui.theme.AssignmentInternshipTheme
import com.example.assignmentinternship.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    private val viewModel: ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssignmentInternshipTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(viewModel, modifier = Modifier.padding(innerPadding))
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
    AssignmentInternshipTheme {
        Greeting("Android")
    }
}