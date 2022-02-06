package com.example.wallet.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wallet.ui.components.balance.Balance
import com.example.wallet.ui.components.header.HomeHeader

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    Column(Modifier.padding(20.dp)) {
        HomeHeader()
        Spacer(modifier = Modifier.height(10.dp))
        Balance(viewModel = viewModel)
    }
}