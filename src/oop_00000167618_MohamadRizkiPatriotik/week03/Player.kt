package oop_00000167618_MohamadRizkiPatriotik.week03

class Player(val username: String) {

    // Properti private, tidak bisa diakses dari luar class
    private var xp: Int = 0

    // Computed Property untuk menghitung level secara dinamis
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level
            xp += amount

            // Cek apakah setelah ditambahkan, levelnya meningkat
            if (level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}
