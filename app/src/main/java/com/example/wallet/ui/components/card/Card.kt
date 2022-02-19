package com.example.wallet.ui.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wallet.R
import com.example.wallet.data.CardType
import com.example.wallet.data.CreditCard
import com.example.wallet.data.CreditCardInfo

//TODO FINISH THIS SCREEN DETAILS
@Composable
fun CreditCard(creditCard: CreditCard) {
    val visaGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xffF57F17),
            Color(0xffFFEE58),
            Color(0xffFFF9C4)
        )
    )

    val masterCardGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF1756F5),
            Color(0xFF4380C9),
            Color(0xFFE9E8E3)
        )
    )
    Card(modifier = Modifier.width(250.dp), shape = RoundedCornerShape(10.dp)) {
        Column(
            modifier = Modifier.background(
                brush = if (creditCard.cardType == CardType.VISA) visaGradient else masterCardGradient
            )
        ) {
            Row {
                Text(text = "Credit Card")
                Image(
                    painterResource(id = R.drawable.wirelesscontact),
                    contentDescription = "wirelessContact",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                )
            }
            Image(
                painterResource(id = R.drawable.cardchip),
                contentDescription = "cardChip",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
            )
            Text(text = "CARD HOLDER")
            Row {
                Text(text = "Gastón Saillén")
                Image(
                    painterResource(id = if (creditCard.cardType == CardType.VISA) R.drawable.visalogo else R.drawable.mastercardlogo),
                    contentDescription = "cardLogo",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun CreditCardPreview() {
    CreditCard(CreditCardInfo.cardList[0])
}
