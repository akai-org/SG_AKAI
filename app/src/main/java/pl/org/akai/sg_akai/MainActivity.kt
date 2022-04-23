package pl.org.akai.sg_akai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
                val openDrawer = rememberDrawerState(DrawerValue.Closed)
                val spacing = LocalSpacing.current

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        TopAppBar {
                            Row(
                                modifier = Modifier.align(Alignment.CenterVertically).fillMaxWidth()
                            ) {
                                Route.getList().forEachIndexed { index, route ->

                                    Button(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .weight(1f)
                                            .fillMaxWidth(),
                                        onClick = { navController.navigate(Route.PlantList) },
                                        shape = RoundedCornerShape(100.dp)
                                    ) {
                                        Text(
                                            text = route,
                                        )
                                    }
                                    if (index != Route.getList().lastIndex) {
                                        Spacer(modifier = Modifier.width(spacing.small))
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(spacing.mediumLarge))

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
}