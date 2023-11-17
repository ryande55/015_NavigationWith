package com.example.gulabatu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanTiga(
    onSubmitButtonClicked:  (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit,
) {
    var namaTxt by remember {
        mutableStateOf("")
    }
    var nimTxt by remember {
        mutableStateOf("")
    }
    var kosentrasiTxt by remember {
        mutableStateOf("")
    }
    var judulskripsiTxt by remember {
        mutableStateOf("")


    }
    var listData: MutableList<String> = mutableListOf(namaTxt, kosentrasiTxt, nimTxt, judulskripsiTxt)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(125.dp))

        Text(text = "Formulir Pengajuan Skripsi", modifier = Modifier.padding(bottom = 25.dp))

        OutlinedTextField(
            value = namaTxt,
            onValueChange = { namaTxt = it },
            label = { Text(text = stringResource(id = R.string.nama)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = nimTxt,
            onValueChange = { nimTxt = it },
            label = { Text(text = stringResource(id = R.string.nim)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = kosentrasiTxt,
            onValueChange = { kosentrasiTxt = it },
            label = { Text(text = stringResource(id = R.string.kosentrasi)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = judulskripsiTxt,
            onValueChange = { judulskripsiTxt = it },
            label = { Text(text = stringResource(id = R.string.judul_skripsi)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .weight(1f, false),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            Button(onClick = { onSubmitButtonClicked(listData) }) {
                Text(text = stringResource(id = R.string.btn_submit))
            }
        }
    }
}
