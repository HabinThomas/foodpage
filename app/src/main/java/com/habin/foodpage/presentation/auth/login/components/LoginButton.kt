package com.habin.foodpage.presentation.auth.login.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habin.foodpage.ui.theme.Button_color

@Composable
fun LoginButton(onclick: () -> Unit, label: String,modifer:Modifier=Modifier) {
    Button(
        onClick = onclick,
        elevation = ButtonDefaults.elevation(3.dp),
        colors = ButtonDefaults.buttonColors(
            Button_color
        ), modifier = modifer
            .size(200.dp, 50.dp)
            .padding(5.dp)
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = Color.White, fontWeight = FontWeight.Bold,

        )

    }
}

