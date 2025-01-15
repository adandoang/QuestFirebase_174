package com.example.meet14firebase.ui.viewmodel

import android.text.Editable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.meet14firebase.MahasiswaApplications
import com.example.meet14firebase.model.Mahasiswa
import com.example.meet14firebase.ui.viewmodel.PenyediaViewModel.aplikasiMahasiswa

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            InsertViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            DetailViewModel(
                createSavedStateHandle(), aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
    }
    fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplications)
}