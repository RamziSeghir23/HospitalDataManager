package com.android.hospitaldatamanager.pantallas.pacientes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.android.hospitaldatamanager.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainPaciente() {
    var textInput by remember { mutableStateOf("") }
//--- Header ---
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        Box() {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xCE2268DA))
                    .height(150.dp)
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF000000),
                        modifier = Modifier.clickable { }
                    )
                }
            }
            Box(modifier = Modifier.padding(40.dp)) {
                Row {
                    Box(
                        modifier = Modifier
                            .size(65.dp)

                    ) {
                        Image(
                            painterResource(id = R.drawable.abuelo),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(percent = 60))
                        )
                    }
                    Box(modifier = Modifier
                        .padding(top = 20.dp, start = 15.dp)
                        .fillMaxSize()) {
                        Text(text = "Hola , Alberto Sánchez", fontWeight = FontWeight.ExtraBold)
                    }
                }
            }
            OutlinedTextField(
                value = textInput,
                onValueChange = { textInput = it },
                placeholder = { Text("Buscar médico , medicina") },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Search,
                        contentDescription = null
                    )
                },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 120.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedBorderColor = Color(0xCE2268DA),

                    )
            )

        }
        //--Content --
        Box(modifier = Modifier.padding(top = 20.dp, start = 30.dp, end = 30.dp).fillMaxWidth().height(60.dp)){
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
                Box(
                    modifier = Modifier
                        .size(65.dp)

                ) {
                    Image(
                        painterResource(id = R.drawable.medical_examination),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)

                    )
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)

                ) {
                    Image(
                        painterResource(id = R.drawable.online_pharmacy_2),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .size(65.dp)

                ) {
                    Image(
                        painterResource(id = R.drawable.ambulance),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )


                }
                Box(
                    modifier = Modifier
                        .size(65.dp)

                ) {
                    Image(
                        painterResource(id = R.drawable.application),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                }

            }

        }



    }







}







