package com.example.attend.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.attend.ui.theme.AttendTheme

@Composable
fun SuccessScreen(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
     Text(
         text = "Attendance Confirmed",
         fontSize = 30.sp,
         fontWeight = FontWeight.ExtraBold
     )
        Text(
            text = "Your Good to go",
            fontSize = 20.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun SuccessScreenPreview(){
    AttendTheme(darkTheme = false) {
        SuccessScreen()
    }
}
@Preview
@Composable
fun SuccessScreenDarkPreview(){
    AttendTheme(darkTheme = true) {
        SuccessScreen()
    }
}