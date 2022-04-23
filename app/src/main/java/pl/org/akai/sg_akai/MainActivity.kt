package pl.org.akai.sg_akai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.poznan.put.michalxpz.core_ui.LocalSpacing
import dagger.hilt.android.AndroidEntryPoint
import pl.org.akai.sg_akai.presentation.home_screen.HomeScreen
import pl.org.akai.sg_akai.presentation.navigation.Route
import pl.org.akai.sg_akai.presentation.plant_list_screen.PlantListScreen
import pl.org.akai.sg_akai.presentation.plant_statistics_screen.PlantStatisticsScreen
import pl.org.akai.sg_akai.presentation.welcome_screen.WelcomeScreen
import pl.org.akai.sg_akai.ui.theme.SmartGardenTheme
import pl.org.akai.sg_akai.presentation.menu.TopBar

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setcontent view for xml ui
//        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //set content for compose ui
        setContent {
            SmartGardenTheme() {
                val navController = rememberNavController()
                val spacing = LocalSpacing.current
                val coroutineScope = rememberCoroutineScope()
                var currentScreen = remember{ mutableStateOf(Route.WELCOME) }
                var previousScreen = remember{ mutableStateOf(Route.WELCOME) }

                Scaffold (
                    topBar = {
                        TopBar(
                            showTopBar = !(currentScreen.value in listOf(Route.HOME, Route.WELCOME)),
                            onBackArrowClicked = {
                                navController.popBackStack()
                                val state = currentScreen.value
                                currentScreen.value = previousScreen.value
                                previousScreen.value = currentScreen.value
                            },
                            onHomeIconClicked = {
                                navController.navigate(Route.HOME)
                                currentScreen.value = Route.HOME
                                currentScreen.value = previousScreen.value
                                previousScreen.value = currentScreen.value
                                                },
                            onCalendarIconClicked = {}
                        )
                    }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Spacer(modifier = Modifier.height(spacing.mediumLarge))

                        NavHost(
                            navController = navController,
                                startDestination = Route.WELCOME
                        ) {
                            composable(
                                Route.WELCOME,
                            ) {
                                WelcomeScreen( onNextClick = {
                                    navController.navigate(Route.HOME)
                                    previousScreen.value = currentScreen.value
                                    currentScreen.value = Route.HOME

                                } )
                            }

                            composable(Route.HOME) {
                                HomeScreen(
                                    onClick = {
                                        navController.navigate(Route.PlantList)
                                        previousScreen.value = currentScreen.value
                                        currentScreen.value = Route.PlantList

                                    }
                                )

                            }

                            composable(Route.PlantList) {
                                PlantListScreen(
                                    onClick = {
                                        navController.navigate(Route.Statistics)
                                        previousScreen.value = currentScreen.value
                                        currentScreen.value = Route.Statistics
                                    }
                                )
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
}