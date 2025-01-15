package com.example.meet14firebase.navigation

interface DestinasiNavigasi{
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi {
    override val route: String = "home"
    override val titleRes: String = "home"
}

object DestinasiInsert : DestinasiNavigasi {
    override val route: String = "insert"
    override val titleRes: String = "insert"
}

object DestinasiDetail : DestinasiNavigasi {
    override val route: String = "detail"
    override val titleRes: String = "detail"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}

object DestinasiUpdate : DestinasiNavigasi {
    override val route: String = "update"
    override val titleRes: String = "update"
}