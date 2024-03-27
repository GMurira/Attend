package com.example.attend.ui.theme.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.attend.R


@Composable
fun LoginScreen(){

    var userName by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_medium)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.Login),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        LoginImage()
        TextInputComponent()
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.signup))
        }
    }
}
@Composable
fun LoginImage(){
    Box (){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Login_age_app_icon",
            contentScale = ContentScale.Crop
        )
    }
}
@Composable
fun TextInputComponent(){
    var userName by remember { mutableStateOf("") }
    var passWord by remember { mutableStateOf("")}
    var showPassWord by remember { mutableStateOf(false)}
    Column (
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
    )
    {
        OutlinedTextField(
            value = userName,
            onValueChange = {},
            singleLine = true,
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "E-mail trailing action")
            },
            trailingIcon = {
                if (userName.isNotEmpty()){
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Trailing close")
                }
            }
        )
        OutlinedTextField(
            value = passWord,
            onValueChange = {},
            singleLine = true,
            leadingIcon = {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Password")
            },
            trailingIcon = {
                if(passWord.isNotEmpty()){
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Clear password")
                }
            },
            visualTransformation = if (showPassWord){
                VisualTransformation.None
            }
            else{
                PasswordVisualTransformation()
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            label = {
                Text(text = stringResource(id = R.string.password))
            },
            placeholder = {
                Text(text = stringResource(id = R.string.typePassword))
            }
        )
    }
}
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}