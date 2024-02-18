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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InputTextBox(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType,
    imeAction: ImeAction = ImeAction.Default

) {
    val focusManager = LocalFocusManager.current
    TextField(
        label = {
            Text(
                text = label,
                color = Color.White
            )
        },
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
        shape = RoundedCornerShape(10.dp),
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

