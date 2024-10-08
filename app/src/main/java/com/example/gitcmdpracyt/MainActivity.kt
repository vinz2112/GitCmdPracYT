package com.example.gitcmdpracyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gitcmdpracyt.ui.theme.GitCmdPracYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            println("THIS IS CONTAINED IN MY SECOND COMMIT")
            println("LOCAL CHANGE")
            println("CHANGE 4")
            println("THIS LINE WILL BE MERGED")
            println("Hello from your friend")
            println("5th *nix revert attempt")
            println("1st test several commits < origin")
            println("2nd test several commits < origin")
            println("3rd test several commits < origin")

            GitCmdPracYTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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
    GitCmdPracYTTheme {
        Greeting("Android")
    }
}
