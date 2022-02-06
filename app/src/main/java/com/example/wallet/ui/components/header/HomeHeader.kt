package com.example.wallet.ui.components.header

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeHeader() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            modifier = Modifier.weight(1f), text = "Bank Cards",
            color = White, fontSize = 35.sp
        )
        IconButton(
            onClick = { },
            modifier = Modifier
                .then(Modifier.size(50.dp))
                .border(1.dp, White, shape = CircleShape)
        ) {
            Icon(Icons.Default.Add, contentDescription = "content description", tint = White)
        }
    }
}


@Preview
@Composable
fun HomeHeaderPreview() {
    HomeHeader()
}