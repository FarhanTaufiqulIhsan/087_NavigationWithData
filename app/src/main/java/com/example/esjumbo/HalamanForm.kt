package com.example.esjumbo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HalamanForm(){
    var namaTxt by rememberSaveable { mutableStateOf("") }
    var alamatTxt by remember { mutableStateOf("") }
    var teleponTxt by remember { mutableStateOf("") }

    var ListDataTxt: MutableList<String> = mutableListOf(namaTxt,alamatTxt,teleponTxt)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Data Pelanggan",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = namaTxt,
            onValueChange = {namaTxt = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(R.string.nama))})
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = alamatTxt,
            onValueChange = {alamatTxt = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource(R.string.alamat))})
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(
            value = teleponTxt,
            onValueChange = {teleponTxt = it},
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(stringResource(R.string.notelp))})
        Spacer(modifier = Modifier.padding(16.dp))

        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.cancel))
            }

            Spacer(modifier = Modifier.padding(50.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.selanjutnya))
            }
        }

    }
}