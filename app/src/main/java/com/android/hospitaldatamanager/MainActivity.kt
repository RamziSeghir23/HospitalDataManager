package com.android.hospitaldatamanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.android.hospitaldatamanager.pantallas.doctores.RegistroDoctores

import com.android.hospitaldatamanager.ui.theme.HospitalDataManagerTheme
import com.androuid.jetpackcomposeinstagram.iniciar_sesion

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HospitalDataManagerTheme {
                 iniciar_sesion()

            }
        }
    }
}
