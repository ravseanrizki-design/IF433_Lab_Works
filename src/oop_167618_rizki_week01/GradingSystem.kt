package oop_167618_rizki_week01

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "rizki"
    val score = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}

}



