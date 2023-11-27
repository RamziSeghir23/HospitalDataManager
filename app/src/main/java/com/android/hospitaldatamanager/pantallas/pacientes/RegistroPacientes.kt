package com.android.hospitaldatamanager.pantallas.pacientes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistroPasientes(){
    Column {
        TopAppBar({  },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF000000)
                    )
                }
            },)
        Box(){
            Column {
                Text(text = "Formulario de Datos",modifier = Modifier.padding(start = 20.dp), fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Información Personal",modifier = Modifier.padding(start = 20.dp), fontSize = 16.sp)
            }
        }
        Box(modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp).background(Color.Red).fillMaxSize()){

        }
        

        
    }




    

}