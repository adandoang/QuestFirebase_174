package com.example.meet14firebase

import android.app.Application
import com.example.meet14firebase.di.AppContainer
import com.example.meet14firebase.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container= MahasiswaContainer()
    }
}