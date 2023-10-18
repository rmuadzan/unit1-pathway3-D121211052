package com.example.businesscardraflimuadzan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardraflimuadzan.ui.theme.BusinessCardRafliMuadzanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardRafliMuadzanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.rafli),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp))
        Text(
            text = "Rafli Muadzan",
            fontSize = 32.sp,
            modifier = Modifier.padding(8.dp),
            color = Color(128, 0, 0)
        )
        Text(
            text = "Software Engineer",
            fontSize = 24.sp,
            modifier = Modifier.padding(4.dp)
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 40.dp)
    ) {
        ContactInfo(
            logo = painterResource(id = R.drawable.email_logo),
            text = "raflimuadzan2@gmail.com"
        )
        ContactInfo(
            logo = painterResource(id = R.drawable.wahtsapp_logo),
            text = "+6285756466653"
        )
        ContactInfo(
            logo = painterResource(id = R.drawable.github_logo),
            text = "rmuadzan"
        )
        ContactInfo(
            logo = painterResource(id = R.drawable.instagram_logo),
            text = "rflim__"
        )
    }
}

@Composable
fun ContactInfo(logo: Painter, text: String) {
    Row {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardRafliMuadzanTheme {
        BusinessCard()
    }
}