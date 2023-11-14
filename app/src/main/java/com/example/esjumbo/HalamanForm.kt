package com.example.esjumbo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HalamanForm(){
    var namaTxt by rememberSaveable { mutableStateOf("") }
    var alamatTxt by remember { mutableStateOf("") }
    var teleponTxt by remember { mutableStateOf("") }
}