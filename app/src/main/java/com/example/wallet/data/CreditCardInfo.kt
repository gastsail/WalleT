package com.example.wallet.data

import android.graphics.Color
import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Headset
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.wallet.R

data class CreditCard(
    val cardType: CardType,
    val cardNumber: Long,
    @DrawableRes val cardLogoId: Int,
    val cardExpenses: List<CardExpenses>
)

data class CardExpenses(
    val expenseType: ExpenseType,
    val expenseTitle: String,
    val expenseBrand: String,
    val expenseCost: Double
)

enum class CardType {
    VISA,
    MASTERCARD
}

enum class ExpenseType(
    val icon: ImageVector
) {
    Transfer(
        icon = Icons.Filled.SwapHoriz,
    ),
    Shopping(
        icon = Icons.Filled.ShoppingBag,
    ),
    Food(
        icon = Icons.Filled.Restaurant,
    ),
    Music(
        icon = Icons.Filled.Headset,
    )
}

object CreditCardInfo {

    private val masterCardExpenses = listOf(
        CardExpenses(
            ExpenseType.Shopping,
            "Nike (Central Park)",
            "Shoes",
            60.0
        ),
        CardExpenses(
            ExpenseType.Transfer,
            "Transfer into",
            "Enya",
            2000.0
        ),
        CardExpenses(
            ExpenseType.Food,
            "Hard Rock Cafe",
            "Food",
            143.50
        )
    )

    private val visaExpenses = listOf(
        CardExpenses(
            ExpenseType.Transfer,
            "Transfer into",
            "Bank",
            3500.0
        ),
        CardExpenses(
            ExpenseType.Food,
            "Mc Donalds",
            "Fast Food",
            75.15
        ),
        CardExpenses(
            ExpenseType.Music,
            "Spotify",
            "Spotify Ltd",
            8.50
        )
    )

    val cardList = listOf(
        CreditCard(
            CardType.MASTERCARD,
            9546894495864359,
            R.drawable.mastercardlogo,
            masterCardExpenses
        ),
        CreditCard(
            CardType.VISA,
            8542894411864322,
            R.drawable.visalogo,
            visaExpenses
        ),
        CreditCard(
            CardType.MASTERCARD,
            5146893495864300,
            R.drawable.mastercardlogo,
            masterCardExpenses
        ),
        CreditCard(
            CardType.VISA,
            5146893495864300,
            R.drawable.visalogo,
            visaExpenses
        )
    )
}