package com.example.meet14firebase.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.meet14firebase.repository.MahasiswaRepository

class InsertViewModel (
    private val mhs: MahasiswaRepository
) : ViewModel() {
    data class MahasiswaEvent(
        val nim: String = "",
        val nama: String = "",
        val jenisKelamin: String = "",
        val alamat: String = "",
        val kelas: String = "",
        val angkatan: String = ""
    )
}