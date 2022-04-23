package pl.org.akai.sg_akai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import pl.org.akai.sg_akai.presentation.home_screen.HomeScreen
import pl.org.akai.sg_akai.presentation.navigation.Route
import pl.org.akai.sg_akai.presentation.plant_list_screen.PlantListScreen
import pl.org.akai.sg_akai.presentation.plant_statistics_screen.PlantStatisticsScreen
import pl.org.akai.sg_akai.presentation.welcome_screen.WelcomeScreen
import pl.org.akai.sg_akai.ui.theme.SmartGardenTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setcontent view for xml ui
//        setContentView(R.layout.activity_main)

        //set content for compose ui
        setContent {
            SmartGardenTheme() {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    TopAppBar{
                        Row (modifier = Modifier.align(Alignment.CenterVertically).fillMaxWidth()) {
                            Button(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .weight(1f)
                                    .fillMaxWidth(),
                                onClick = { navController.navigate(Route.HOME)}
                            ) {
                                Text("Home")
                            }

                            Button(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .weight(1f)
                                    .fillMaxWidth(),
                                onClick = { navController.navigate(Route.WELCOME)}
                            ) {
                                Text("Welcome")
                            }

                            Button(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .weight(1f)
                                    .fillMaxWidth(),
                                onClick = { navController.navigate(Route.Statistics)}
                            ) {
                                Text("Stats")
                            }

                            Button(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .weight(1f)
                                    .fillMaxWidth(),
                                onClick = { navController.navigate(Route.PlantList)}
                            ) {
                                Text("List")
                            }
                        }
                    }

                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME
                    ) {
                        composable(Route.WELCOME) {
                            WelcomeScreen()
                        }

                        composable(Route.HOME) {
                            HomeScreen()
                        }

                        composable(Route.PlantList) {
                            PlantListScreen()
                        }

                        composable(Route.Statistics) {
                            PlantStatisticsScreen()
                        }
                    }
                }
            }
        }
    }
}