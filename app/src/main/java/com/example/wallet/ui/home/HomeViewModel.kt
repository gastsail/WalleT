package com.example.wallet.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel: ViewModel() {

    private val _balance = MutableStateFlow(0f)
    val balance: StateFlow<Float> = _balance

    // TODO UPDATE BALANCE WHEN SWITCHING CARDS
    fun updateBalance(newBalance: Float) {
        _balance.value = newBalance
    }

}