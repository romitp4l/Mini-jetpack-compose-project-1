package com.example.mini_jetpack_compose_project_1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mini_jetpack_compose_project_1.ui.theme.Minijetpackcomposeproject1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Minijetpackcomposeproject1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginUi()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginUi() {

    val context = LocalContext.current

    val email = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = " This is the sample text for the simple app .",
            fontSize = 26.sp,
            textAlign = TextAlign.Center


        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.icon), contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .width(250.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))
// Email section
        OutlinedTextField(value = email.value, onValueChange = {
            email.value = it
        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),
            placeholder = {
                Text(text = "Enter your email")
            }
        )



        Spacer(modifier = Modifier.height(20.dp))

        // Password Section

        OutlinedTextField(value = password.value, onValueChange = {
            password.value = it
        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),
            placeholder = {
                Text(text = "Enter your password")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {

                      Toast.makeText(context,"You have clicked on the button successfully ",Toast.LENGTH_LONG).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            
            Text(text = "Click to login.")

        }


    }
}
