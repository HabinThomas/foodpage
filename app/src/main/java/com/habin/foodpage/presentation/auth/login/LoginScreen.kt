package com.habin.foodpage.presentation.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.habin.foodpage.presentation.auth.login.components.InputTextBox
import com.habin.foodpage.presentation.auth.login.components.InputTextBox_password
import com.habin.foodpage.presentation.auth.login.components.LoginButton

@Composable
fun LoginScreen() {
    LoginScreen_()
}

@Composable
fun LoginScreen_() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Red)
        ) {
//            TODO A
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(com.habin.foodpage.R.string.register_device),
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(com.habin.foodpage.R.string.enter_your_credentials_to_register_the_device),
                fontSize = 12.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
            )
            InputTextBox(
                label = "Email",
                value = "Email",
                onValueChange = {},
                keyboardType = KeyboardType.Email
            )
            InputTextBox_password(
                label = "Password",
                value = "Password",
                onValueChange = {},
                keyboardType = KeyboardType.Password
            )
            LoginButton(onclick = { /*TODO*/ }, label = "Login")
        }

    }

}


@Preview(
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun LoginScreenPreview() {
    LoginScreen_()
}