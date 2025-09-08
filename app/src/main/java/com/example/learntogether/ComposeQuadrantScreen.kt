package com.example.learntogether

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme

@Composable
fun ComposeQuadrantScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        // Fila inferior
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    LearnTogetherTheme {
        ComposeQuadrantScreen()
    }
}
