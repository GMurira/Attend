package com.example.attend.ui.theme.screens



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.attend.R
import com.example.attend.ui.theme.AttendTheme

@Composable
fun SettingsScreen(modifier: Modifier = Modifier){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(dimensionResource(id = R.dimen.padding_medium))){
        SwitchComponent()
    }
}

/**
 *Settings Switch component
 */
@Composable
fun SwitchComponent(){
    var checked by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Notifications", fontSize = 28.sp)
            Text(text = "Notifications")
        }
        Switch(checked = checked, onCheckedChange = {
            checked = it
        })
    }
}
@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview(){
    AttendTheme {
        SettingsScreen()
    }
}

/**
 * Data class to handle for togleable info
 */
data class ToggleInfo(
    val isChecked: Boolean,
    val text: String
)