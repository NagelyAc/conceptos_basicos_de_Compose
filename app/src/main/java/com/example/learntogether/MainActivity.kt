package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantScreen()
                    //ComposeArticle()
                    //TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle() {
    Column(modifier = Modifier.fillMaxSize()) {


        Image(
            painter = painterResource(id = R.drawable.bg_compose_background), // tu recurso
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = stringResource(id = R.string.titulo),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = stringResource(id = R.string.parrafo1),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = stringResource(id = R.string.parrafo2),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    LearnTogetherTheme {
        ComposeArticle()
    }
}
