package com.example.wallet.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel: ViewModel() {

    private val _balance = MutableStateFlow(BalanceUiState())
    val balance: StateFlow<BalanceUiState> = _balance

    // TODO UPDATE BALANCE WHEN SWITCHING CARDS
    fun updateBalance(newBalance: BalanceUiState) {
        _balance.value = newBalance
    }
}

data class BalanceUiState(val currentBalance: Float = 0f)