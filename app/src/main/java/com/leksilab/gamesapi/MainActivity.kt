package com.leksilab.gamesapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.leksilab.gamesapi.navigation.NavManager
import com.leksilab.gamesapi.ui.theme.GamesApiTheme
import com.leksilab.gamesapi.viewModel.GamesViewModel
import com.leksilab.gamesapi.views.HomeView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: GamesViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            GamesApiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //HomeView(modifier = Modifier.padding(innerPadding))
                    NavManager(viewModel)
                }
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeView(viewModel)
                    NavManager(viewModel)
                }*/
            }
        }
    }
}