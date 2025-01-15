package com.example.meet14firebase.model

data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenis_kelamin: String,
    val kelas: String,
    val angkatan: String,
    val dosen1: String,
    val dosen2: String,
    val judul_skripsi: String
) {
    constructor(
    ) :this("", "", "", "", "", "","","","")
}

