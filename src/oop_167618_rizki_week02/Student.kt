package oop_167618_rizki_week02

// Langkah 5: Modifikasi Primary Constructor dengan menambahkan gpa bertipe Double = 0.0 di paling akhir
class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0 // <-- Default Argument
){
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor otomatis mewarisi nilai default gpa = 0.0 karena memanggil 'this' ke Primary
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}