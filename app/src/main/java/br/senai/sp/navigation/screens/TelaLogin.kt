package br.senai.sp.navigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.UiMode

@Composable
fun TelaLogin() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF009688)
    ) {
        Column {
            Text(text = "Login")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaLoginPrev() {
    TelaLogin()
}