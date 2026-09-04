package oop_167618_rizki_week01

// Fungsi Expression Body (Tulis di luar main)
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "rizki"
    val score = 80

    println("Nama: $name, Nilai: $score")

    // Logika When Expression yang benar dan bersih
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Memanggil fungsi kalkulasi status
    println("Status: ${calculateStatus(score)}")
    // Memanggil fungsi kalkulasi status
    println("Status: ${calculateStatus(score)}")

    // TAMBAHKAN KODE INI DI SINI:
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}
