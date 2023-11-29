package com.androuid.jetpackcomposeinstagram

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.android.hospitaldatamanager.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun iniciar_sesionEn(navigationController: NavHostController) {
    TopAppBar(
        { },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFF000000),
                    modifier = Modifier.clickable { navigationController.navigate("main_AppEn") }
                )
            }
        },
    )
    Box(
        Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {

        BodyEn(
            Modifier.align(Alignment.Center)
        )
        FooterEn(Modifier.align(Alignment.BottomCenter), navigationController)    }

}

@Composable
fun FooterEn(modifier: Modifier, navigationController: NavHostController) {
    Column(modifier = modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.size(24.dp))
        SignUpEn(navigationController = navigationController)
        Spacer(modifier = Modifier.size(24.dp))
    }
}

@Composable
fun SignUpEn(navigationController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "You do not have an account?",
            fontSize = 12.sp,
            color = Color(0xFFB5B5B5)
        )
        Text(
            text = "Sign up.",
            modifier = Modifier.padding(horizontal = 8.dp).clickable {
                navigationController.navigate("SeleccionEn")
            },
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff2268Da)
        )
    }
}

@Composable
fun BodyEn(modifier: Modifier) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var isLoginEnable by remember {
        mutableStateOf(false)
    }
    Column(modifier = modifier) {
        ImageLogoEn(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.size(16.dp))
        EmailEn(email) {
            email = it
            isLoginEnable = enabledLogin(email, password)
        }
        Spacer(modifier = Modifier.size(8.dp))
        PasswordEn(password) {
            password = it
            isLoginEnable = enabledLoginEn(email, password)
        }
        Spacer(modifier = Modifier.size(8.dp))
        ForgotPasswordEn(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.size(16.dp))
        LoginButtonEn(isLoginEnable)
        Spacer(modifier = Modifier.size(16.dp))
        LoginDividerEn()
        Spacer(modifier = Modifier.size(36.dp))

    }

}


@Composable
fun LoginDividerEn() {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        Divider(
            Modifier
                .background(Color(0xFFF9FF9))
                .height(1.dp)
                .weight(1f)
        )

        Text(
            text = "OR",
            modifier = Modifier.padding(horizontal = 6.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFB5B5B5)
        )
        Divider(
            Modifier
                .background(Color(0xFFF9FF9))
                .height(1.dp)
                .weight(1f)
        )
    }
}

@Composable
fun LoginButtonEn(LoginEnable: Boolean) {
    Button(
        onClick = {  },
        enabled = LoginEnable,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xff4ea8e9),
            disabledContainerColor = Color(0xFFD5D5D5),
            contentColor = Color.Black,
            disabledContentColor = Color.White

        )
    ) {
        Text(text = "Log in ")
    }
}
fun enabledLoginEn(email: String, password: String) =
    Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6



@Composable
fun ForgotPasswordEn(modifier: Modifier) {
    Text(
        text = "Have you forgotten your password ?",
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xff2268Da),
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordEn(password: String, onTextChanged: (String) -> Unit) {
    var passwordVisibility by remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = password, onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text(text = "Password", color = Color.Black, fontSize = 12.sp) },
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF000000),
            containerColor = Color(0xFFF1F1F1),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val imagen = if (passwordVisibility) {
                Icons.Filled.Lock
            } else {
                Icons.Filled.Lock
            }
            IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                Icon(imageVector = imagen, contentDescription = "show Password")
            }
        },
        visualTransformation = if (passwordVisibility) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        }
    )


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailEn(email: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = email, onValueChange = {
            onTextChanged(it)
        },
        modifier = Modifier
            .fillMaxWidth(),
        label = { Text(text = "DNI - Email", color = Color.Black, fontSize = 12.sp) },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF000000),
            containerColor = Color(0xFFF1F1F1),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )

    )


}

@Composable
fun ImageLogoEn(modifier: Modifier) {

Image(painterResource(id = R.drawable.pngwing_com )  , contentDescription ="" ,
    Modifier
        .size(300.dp)
        .padding(start = 80.dp))
    Column {
        Text(text = "Welcome back !", fontSize = 30.sp)
        Text(text = "Log in login to continue ",color = Color(0xF5979595), fontSize = 15.sp)
    }
}




