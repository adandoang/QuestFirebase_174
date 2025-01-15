package com.example.meet14firebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import com.example.meet14firebase.ui.view.HomeScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.navArgument
import com.example.meet14firebase.ui.view.DetailScreen
import com.example.meet14firebase.ui.view.InsertMhsView

@Composable
fun PengelolaHalaman(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost (
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable (DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiInsert.route)},
                onDetailClick = { nim ->
                    navController.navigate("${DestinasiDetail.route}/$nim")
                }
            )
        }

        composable (DestinasiInsert.route) {
            InsertMhsView(
                onBack = { navController.popBackStack() },
                onNavigate = {
                    navController.navigate(DestinasiHome.route)
                }
            )
        }
        composable(DestinasiDetail.routesWithArg, arguments = listOf(navArgument(DestinasiDetail.NIM) {
            type = NavType.StringType })
        ){
            val nim = it.arguments?.getString(DestinasiDetail.NIM)
            nim?.let { nim ->
                DetailScreen(
                    navigateToItemUpdate = { navController.navigate("${DestinasiUpdate.route}/$nim") },
                    navigateBack = { navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) { inclusive = true }
                       }
                    }
                )
            }
        }
    }
}