package pl.org.akai.sg_akai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
                Scaffold (
                    topBar = {
                        TopBar(
                            showTopBar = navController.currentDestination?.let { it.route in listOf(Route.HOME, Route.WELCOME) } ?: false,
                            onBackArrowClicked = { navController.popBackStack() },
                            onHomeIconClicked = { navController.navigate(Route.HOME) },
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
                            composable(Route.WELCOME) {
                                WelcomeScreen( onNextClick = { navController.navigate(Route.HOME) } )
                            }

                            composable(Route.HOME) {
//                                HomeScreen()
                                PlantListScreen()

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
}