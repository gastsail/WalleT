package com.example.wallet.ui.components.balance

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.wallet.ui.home.HomeViewModel

@Composable
fun Balance(viewModel: HomeViewModel) {
    val balance = viewModel.balance.collectAsState()
    Column {
        Text(text = "Balance", color = Color.White)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "$${balance.value}", color = Color.White)
    }
}