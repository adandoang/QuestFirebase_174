package com.example.meet14firebase.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.meet14firebase.repository.MahasiswaRepository

class InsertViewModel (
    private val mhs: MahasiswaRepository
) : ViewModel() {

    data class FormErrorState (
        val nim: String? = null,
        val nama: String? = null,
        val jenisKelamin: String? = null,
        val alamat: String? = null,
        val kelas: String? = null,
        val angkatan: String? = null
    ) {
        fun isValid(): Boolean {
            return nim == null && nama == null && jenisKelamin == null && alamat == null &&
                    kelas == null && angkatan == null
        }
    }

    data class MahasiswaEvent(
        val nim: String = "",
        val nama: String = "",
        val jenisKelamin: String = "",
        val alamat: String = "",
        val kelas: String = "",
        val angkatan: String = ""
    )
}