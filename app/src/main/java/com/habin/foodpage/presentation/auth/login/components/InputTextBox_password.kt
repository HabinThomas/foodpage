package com.habin.foodpage.presentation.auth.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InputTextBox_password(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType,
    imeAction: ImeAction = ImeAction.Default

) {
    val focusManager = LocalFocusManager.current
    var passwordVisibility: Boolean by remember { mutableStateOf(false)}
    var password by rememberSaveable { mutableStateOf("") }

    TextField(
        label = {
            Text(
                text = label,
//                fontFamily = FontFamily(Font(R.font.sf_regular)),
                color = Color.Black
            )
        },
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
        shape = RoundedCornerShape(10.dp),
        visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisibility)
                Icons.Filled.Visibility
            else Icons.Filled.VisibilityOff

            // Please provide localized description for accessibility services
            val description = if (passwordVisibility) "Hide password" else "Show password"

            IconButton(onClick = {passwordVisibility = !passwordVisibility}){
                Icon(imageVector = image,contentDescription = description)
            }
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            focusedLabelColor = Color.Black,
            backgroundColor = Color.White,
            textColor = Color.Black,
            cursorColor = Color.Black
        ),
        textStyle = TextStyle(
//            fontFamily = FontFamily(Font(R.font.sf_regular)),
            textAlign = TextAlign.Start,
            fontSize = 14.sp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .background(Color.White)
            .border(width = 1.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
            .height(50.dp),
        maxLines = 1,
        keyboardActions = KeyboardActions(onDone = {
            focusManager.clearFocus()
        })
    )
}

