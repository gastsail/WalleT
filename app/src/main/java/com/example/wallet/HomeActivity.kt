package com.example.wallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.wallet.ui.home.BalanceUiState
import com.example.wallet.ui.home.HomeScreen
import com.example.wallet.ui.home.HomeViewModel
import com.example.wallet.ui.theme.ScreenBackgroundColor
import com.example.wallet.ui.theme.WalleTTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeActivity : ComponentActivity() {

    private val viewModel by viewModels<HomeViewModel> {
        defaultViewModelProviderFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WalleTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = ScreenBackgroundColor
                ) {
                    lifecycleScope.launch {
                        repeatOnLifecycle(Lifecycle.State.STARTED) {
                            viewModel.updateBalance(BalanceUiState(10.0f))
                            delay(5000)
                            viewModel.updateBalance(BalanceUiState(50.0f))
                        }
                    }
                    HomeScreen(viewModel = viewModel)
                }
            }
        }
    }
}